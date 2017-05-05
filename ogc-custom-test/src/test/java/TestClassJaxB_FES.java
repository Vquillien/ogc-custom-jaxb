
import junit.framework.Assert;
import net.opengis.fes._2_0_2.*;
import net.opengis.wfs._2_1.PropertyType;
import org.junit.*;

import javax.xml.bind.*;
import javax.xml.namespace.QName;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by quillien on 02/05/2017.
 * Test of generate class on .xsd about Filter Encoding Standard
 */
public class TestClassJaxB_FES {
    private static final int NUMBER_FILTER = 27;
    private ArrayList<File> listFile;
    private File XMLInitial;
    private File XMLReturn;

    /**
     * initialisation Create an ArrayList of  File and add of xml files
     */
    @Before
    public void initialize() throws IOException {
        String path;
        listFile = new ArrayList<File>();
        listXMLTag = new ArrayList<String>();
        for(int i=1;i<=NUMBER_FILTER;i++){
            path = "src\\main\\resources\\filtre_test\\filter";
            if(i<10)path += "0";
            path += (i+".xml");
            listFile.add(new File(path));
        }
    }


    /**
     * Test Round-tripping
     * @throws JAXBException
     * @throws IOException
     */
    @Test
    public void TestXMLFile() throws JAXBException, IOException {

        Assert.assertNotNull("list file is null",listFile);

        Unmarshaller unmarshaller = JaxbContainer.JAXBCONTEXT.createUnmarshaller();
        Marshaller marshaller = JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //the xml file od the list in directory:resources/filtre_test
        for (File filterXML : listFile ) {
            XMLInitial = filterXML;
            Object ob = unmarshaller.unmarshal(filterXML);

            marshaller.marshal(ob,new File("src\\main\\resources\\filtre_test\\XMLreturn.xml"));
            XMLReturn = new File("src\\main\\resources\\filtre_test\\XMLreturn.xml");

            listXMLTag.clear();
        }

    }

    /**
     *
     */
    @Test
    public void TestJavaObject () throws JAXBException {
        ObjectFactory objFactory = new ObjectFactory();

        Marshaller marshaller = JaxbContainer.JAXBCONTEXT.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Unmarshaller unmarshaller = JaxbContainer.JAXBCONTEXT.createUnmarshaller();

        /**
         * filtre 1
         * < ?xml version="1.0"?>
         * <fes:Filter
         * xmlns:fes="http://www.opengis.net/fes/2.0"
         * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         * xsi:schemaLocation="http://www.opengis.net/fes/2.0 http://schemas.opengis.net/filter/2.0/filterAll.xsd">
         * <fes:PropertyIsEqualTo>
         * <fes:ValueReference>SomeProperty</fes:ValueReference>
         * <fes:Literal>100</fes:Literal>
         * </fes:PropertyIsEqualTo>
         * </fes:Filter>
         */
        FilterType filter = objFactory.createFilterType();
        BinaryComparisonOpType valueBinary = objFactory.createBinaryComparisonOpType();
        JAXBElement<String> vRef = objFactory.createValueReference("SomeProperty");
        LiteralType literal = objFactory.createLiteralType();
        literal.getContent().add("100");
        JAXBElement<LiteralType> valLiteral = objFactory.createLiteral(literal);
        valueBinary.getExpression().add(vRef);
        valueBinary.getExpression().add(valLiteral);
        JAXBElement<BinaryComparisonOpType> equalTo = objFactory.createPropertyIsEqualTo(valueBinary);
        filter.setComparisonOps(equalTo);
        JAXBElement<FilterType> eleFilter = objFactory.createFilter(filter);

        marshaller.marshal(eleFilter,new File("src\\main\\resources\\filtre_test\\XMLreturn.xml"));
        XMLReturn = new File("src\\main\\resources\\filtre_test\\XMLreturn.xml");
        displayFile(XMLReturn);

        Object ob = unmarshaller.unmarshal(XMLReturn);
        Assert.assertEquals(ob,eleFilter);

        /**
         * filtre 2
         * < ?xml version="1.0"?>
         * <fes:Filter
         * xmlns:fes="http://www.opengis.net/fes/2.0"
         * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         * xsi:schemaLocation="http://www.opengis.net/fes/2.0 http://schemas.opengis.net/filter/2.0/filterAll.xsd">
         * <fes:PropertyIsLessThan>
         *    <fes:ValueReference>DEPTH</fes:ValueReference>
         *          <fes:Literal>30</fes:Literal>
         *    </fes:PropertyIsLessThan>
         * </fes:Filter>
         */
        filter = objFactory.createFilterType();
        valueBinary = objFactory.createBinaryComparisonOpType();
        vRef = objFactory.createValueReference("DEPTH");
        literal = objFactory.createLiteralType();
        literal.getContent().clear();
        literal.getContent().add("30");
        valLiteral = objFactory.createLiteral(literal);
        valueBinary.getExpression().add(vRef);
        valueBinary.getExpression().add(valLiteral);
        JAXBElement<BinaryComparisonOpType> lessThan = objFactory.createPropertyIsLessThan(valueBinary);
        filter.setComparisonOps(lessThan);
        eleFilter = objFactory.createFilter(filter);


        marshaller.marshal(eleFilter,new File("src\\main\\resources\\filtre_test\\XMLreturn.xml"));
        XMLReturn = new File("src\\main\\resources\\filtre_test\\XMLreturn.xml");
        displayFile(XMLReturn);
        ob = unmarshaller.unmarshal(XMLReturn);
        Assert.assertEquals(ob,eleFilter);



    }


    public void displayFile(File file){
        try{
            InputStream flux=new FileInputStream(file);
            InputStreamReader lecture=new InputStreamReader(flux);
            BufferedReader buff=new BufferedReader(lecture);
            String line;
            while ((line=buff.readLine())!=null ) {
                System.out.println(line);
            }
            buff.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
