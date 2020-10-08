package com.turn.ttorrent.common.protocol;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestHaveMessagePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testValidate1() throws Exception {
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
        "    <hb>AAAABQQAAADS</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>210</piece>" +
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
        "    <hb>AAAABQQAAADS</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>210</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate1-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate2() throws Exception {
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
        "    <hb>AAAABQQAAAA6</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>58</piece>" +
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
        "    <hb>AAAABQQAAAA6</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>58</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate2-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate3() throws Exception {
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
        "    <hb>AAAABQQAAABw</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>112</piece>" +
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
        "    <hb>AAAABQQAAABw</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>112</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate3-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate4() throws Exception {
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
        "    <hb>AAAABQQAAAGW</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>406</piece>" +
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
        "    <hb>AAAABQQAAAGW</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>406</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate4-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate5() throws Exception {
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
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate5-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate6() throws Exception {
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
        "    <hb>AAAABQQAAABs</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>108</piece>" +
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
        "    <hb>AAAABQQAAABs</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>108</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate6-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate7() throws Exception {
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
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate7-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate8() throws Exception {
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
        "    <hb>AAAABQQAAAEM</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>268</piece>" +
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
        "    <hb>AAAABQQAAAEM</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>268</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate8-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate9() throws Exception {
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
        "    <hb>AAAABQQAAAIM</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>524</piece>" +
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
        "    <hb>AAAABQQAAAIM</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>524</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate9-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate10() throws Exception {
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
        "    <hb>AAAABQQAAAGn</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>423</piece>" +
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
        "    <hb>AAAABQQAAAGn</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>423</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate10-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate11() throws Exception {
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
        "    <hb>AAAABQQAAAC9</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>189</piece>" +
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
        "    <hb>AAAABQQAAAC9</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>189</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate11-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate12() throws Exception {
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
        "    <hb>AAAABQQAAAG2</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>438</piece>" +
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
        "    <hb>AAAABQQAAAG2</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>438</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate12-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate13() throws Exception {
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
        "    <hb>AAAABQQAAANi</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>866</piece>" +
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
        "    <hb>AAAABQQAAANi</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>866</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate13-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate14() throws Exception {
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
        "    <hb>AAAABQQAAAFP</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>335</piece>" +
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
        "    <hb>AAAABQQAAAFP</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>335</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate14-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate15() throws Exception {
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
        "    <hb>AAAABQQAAAFw</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>368</piece>" +
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
        "    <hb>AAAABQQAAAFw</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>368</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate15-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate16() throws Exception {
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
        "    <hb>AAAABQQAAAOL</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>907</piece>" +
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
        "    <hb>AAAABQQAAAOL</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>907</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate16-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate17() throws Exception {
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
        "    <hb>AAAABQQAAAEK</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>266</piece>" +
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
        "    <hb>AAAABQQAAAEK</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>266</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate17-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate18() throws Exception {
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
        "    <hb>AAAABQQAAAMa</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>794</piece>" +
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
        "    <hb>AAAABQQAAAMa</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>794</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate18-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate19() throws Exception {
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
        "    <hb>AAAABQQAAAOE</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>900</piece>" +
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
        "    <hb>AAAABQQAAAOE</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>900</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate19-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate20() throws Exception {
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
        "    <hb>AAAABQQAAALK</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>714</piece>" +
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
        "    <hb>AAAABQQAAALK</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>714</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate20-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate21() throws Exception {
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
        "    <hb>AAAABQQAAAAo</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>40</piece>" +
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
        "    <hb>AAAABQQAAAAo</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>40</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate21-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate22() throws Exception {
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
        "    <hb>AAAABQQAAAEm</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>294</piece>" +
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
        "    <hb>AAAABQQAAAEm</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>294</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate22-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate23() throws Exception {
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
        "    <hb>AAAABQQAAAJX</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>599</piece>" +
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
        "    <hb>AAAABQQAAAJX</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>599</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate23-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate24() throws Exception {
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
        "    <hb>AAAABQQAAAOi</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>930</piece>" +
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
        "    <hb>AAAABQQAAAOi</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>930</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate24-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate25() throws Exception {
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
        "    <hb>AAAABQQAAAG6</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>442</piece>" +
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
        "    <hb>AAAABQQAAAG6</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>442</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate25-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate26() throws Exception {
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
        "    <hb>AAAABQQAAABk</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>100</piece>" +
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
        "    <hb>AAAABQQAAABk</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>100</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate26-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate27() throws Exception {
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
        "    <hb>AAAABQQAAAAg</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>32</piece>" +
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
        "    <hb>AAAABQQAAAAg</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>32</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate27-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate28() throws Exception {
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
        "    <hb>AAAABQQAAADn</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>231</piece>" +
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
        "    <hb>AAAABQQAAADn</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>231</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate28-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate29() throws Exception {
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
        "    <hb>AAAABQQAAABf</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>95</piece>" +
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
        "    <hb>AAAABQQAAABf</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>95</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate29-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate30() throws Exception {
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
        "    <hb>AAAABQQAAANV</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>853</piece>" +
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
        "    <hb>AAAABQQAAANV</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>853</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate30-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate31() throws Exception {
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
        "    <hb>AAAABQQAAALz</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>755</piece>" +
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
        "    <hb>AAAABQQAAALz</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>755</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate31-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate32() throws Exception {
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
        "    <hb>AAAABQQAAAL7</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>763</piece>" +
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
        "    <hb>AAAABQQAAAL7</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>763</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate32-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate33() throws Exception {
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
        "    <hb>AAAABQQAAADw</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>240</piece>" +
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
        "    <hb>AAAABQQAAADw</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>240</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate33-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate34() throws Exception {
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
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate34-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate35() throws Exception {
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
        "    <hb>AAAABQQAAAQT</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>1043</piece>" +
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
        "    <hb>AAAABQQAAAQT</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>1043</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate35-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }

    @Test
    public void testValidate36() throws Exception {
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
        "    <hb>AAAABQQAAAOZ</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>921</piece>" +
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
        "    <hb>AAAABQQAAAOZ</hb>" +
        "    <offset>5</offset>" +
        "    <isReadOnly>false</isReadOnly>" +
        "    <bigEndian>true</bigEndian>" +
        "    <nativeByteOrder>false</nativeByteOrder>" +
        "  </data>" +
        "  <piece>921</piece>" +
        "</com.turn.ttorrent.common.protocol.PeerMessage_-HaveMessage>";
        com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage expectedObject = (com.turn.ttorrent.common.protocol.PeerMessage.HaveMessage) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage.validate36-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        com.turn.ttorrent.common.TorrentInfo paramObject1 = (com.turn.ttorrent.common.TorrentInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.validate(paramObject1));
    }
}