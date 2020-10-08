package com.turn.ttorrent.bcodec;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestBEValuePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetLong1() throws Exception {
        String receivingXML = 
        "<com.turn.ttorrent.bcodec.BEValue>" +
        "  <value class=\"big-int\">306184192</value>" +
        "</com.turn.ttorrent.bcodec.BEValue>";
        com.turn.ttorrent.bcodec.BEValue receivingObject = (com.turn.ttorrent.bcodec.BEValue) xStream.fromXML(receivingXML);
        Assert.assertEquals(306184192, receivingObject.getLong());
    }

    @Test
    public void testGetLong2() throws Exception {
        String receivingXML = 
        "<com.turn.ttorrent.bcodec.BEValue>" +
        "  <value class=\"big-int\">1556363805</value>" +
        "</com.turn.ttorrent.bcodec.BEValue>";
        com.turn.ttorrent.bcodec.BEValue receivingObject = (com.turn.ttorrent.bcodec.BEValue) xStream.fromXML(receivingXML);
        Assert.assertEquals(1556363805, receivingObject.getLong());
    }
}