package com.turn.ttorrent.common.protocol;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestHaveMessagePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testValidate1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACP</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>143</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACP</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>143</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate1-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>741</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>741</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate2-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIU</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>532</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIU</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>532</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate3-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABP</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>79</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABP</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>79</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate4-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAHg</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>480</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAHg</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>480</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate5-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAC4</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>184</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAC4</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>184</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate6-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAAq</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>42</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAAq</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>42</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate7-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGV</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>405</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGV</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>405</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate8-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>415</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>415</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate9-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>415</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>415</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate10-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACQ</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>144</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACQ</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>144</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate11-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMV</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>789</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMV</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>789</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate12-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAH/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>511</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAH/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>511</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate13-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMm</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>806</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMm</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>806</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate14-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAEu</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>302</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAEu</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>302</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate15-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMr</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>811</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMr</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>811</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate16-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMh</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>801</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMh</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>801</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate17-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAL6</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>762</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAL6</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>762</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate18-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAI0</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>564</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAI0</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>564</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate19-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANY</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>856</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANY</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>856</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate20-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAADr</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>235</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAADr</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>235</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate21-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARd</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1117</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARd</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1117</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate22-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACw</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>176</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACw</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>176</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate23-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARP</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1103</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARP</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1103</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate24-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACb</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>155</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACb</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>155</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate25-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAP8</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1020</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAP8</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1020</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate26-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJa</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>602</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJa</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>602</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate27-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFj</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>355</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFj</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>355</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate28-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALL</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>715</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALL</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>715</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate29-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACD</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>131</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACD</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>131</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate30-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALV</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>725</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALV</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>725</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate31-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMY</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>792</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMY</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>792</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate32-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANd</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>861</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANd</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>861</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate33-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPE</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>964</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPE</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>964</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate34-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAO0</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>948</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAO0</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>948</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate35-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAEb</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>283</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAEb</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>283</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate36-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACU</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>148</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACU</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>148</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate37-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAO7</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>955</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAO7</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>955</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate38-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJS</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>594</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJS</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>594</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate39-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAQl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1061</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAQl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1061</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate40-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAP6</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1018</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAP6</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1018</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate41-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAN1</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>885</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAN1</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>885</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate42-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPC</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>962</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPC</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>962</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate43-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABY</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>88</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABY</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>88</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate44-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAADI</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>200</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAADI</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>200</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate45-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARa</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1114</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARa</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1114</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate46-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABn</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>103</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABn</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>103</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate47-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFi</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>354</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFi</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>354</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate48-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPk</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>996</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPk</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>996</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate49-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKH</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>647</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKH</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>647</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate50-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAL+</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>766</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAL+</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>766</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate51-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGz</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>435</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGz</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>435</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate52-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAN1</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>885</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAN1</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>885</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate53-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKE</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>644</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKE</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>644</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate54-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFH</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>327</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFH</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>327</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate55-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>863</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>863</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate56-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAASB</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1153</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAASB</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1153</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate57-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFE</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>324</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFE</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>324</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate58-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACn</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>167</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAACn</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>167</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate59-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAR/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1151</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAR/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1151</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate60-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARg</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1120</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAARg</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1120</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate61-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKp</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>681</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKp</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>681</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate62-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPp</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1001</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAPp</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1001</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate63-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAM/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>831</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAM/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>831</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate64-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFG</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>326</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAFG</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>326</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate65-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGx</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>433</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGx</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>433</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate66-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAEL</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>267</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAEL</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>267</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate67-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAASD</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1155</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAASD</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1155</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate68-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAQz</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1075</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAQz</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1075</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate69-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIF</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>517</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIF</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>517</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate70-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>799</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMf</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>799</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate71-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAH/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>511</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAH/</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>511</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate72-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJO</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>590</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJO</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>590</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate73-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAQq</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1066</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAQq</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1066</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate74-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKR</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>657</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAKR</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>657</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate75-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABd</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>93</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABd</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>93</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate76-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANM</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>844</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANM</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>844</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate77-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAR8</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1148</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAR8</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1148</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate78-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAED</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>259</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAED</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>259</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate79-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIu</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>558</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIu</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>558</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate80-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAD5</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>249</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAD5</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>249</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate81-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMt</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>813</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMt</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>813</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate82-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJ6</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>634</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJ6</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>634</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate83-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAE1</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>309</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAE1</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>309</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate84-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABy</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>114</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAABy</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>114</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate85-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAOy</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>946</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAOy</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>946</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate86-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAAQ</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>16</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAAQ</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>16</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate87-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMe</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>798</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAMe</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>798</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate88-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIt</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>557</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAIt</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>557</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate89-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAAJ</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>9</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAAJ</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>9</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate90-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>613</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAJl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>613</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate91-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAH5</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>505</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAH5</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>505</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate92-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAADz</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>243</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAADz</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>243</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate93-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALw</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>752</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAALw</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>752</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate94-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>421</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAGl</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>421</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate95-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANF</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>837</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAANF</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>837</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate96-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate97() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAHS</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>466</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAHS</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>466</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate97-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testValidate98() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAR0</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1140</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage receivingObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>" +
            "  <type>HAVE</type>" +
            "  <data class=\"java.nio.HeapByteBuffer\">" +
            "    <mark>-1</mark>" +
            "    <position>0</position>" +
            "    <limit>4</limit>" +
            "    <capacity>4</capacity>" +
            "    <address>21</address>" +
            "    <hb>AAAABQQAAAR0</hb>" +
            "    <offset>5</offset>" +
            "    <isReadOnly>false</isReadOnly>" +
            "    <bigEndian>true</bigEndian>" +
            "    <nativeByteOrder>false</nativeByteOrder>" +
            "  </data>" +
            "  <piece>1140</piece>" +
            "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
            com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate98-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}