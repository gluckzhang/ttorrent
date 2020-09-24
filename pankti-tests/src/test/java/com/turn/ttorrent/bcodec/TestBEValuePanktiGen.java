package com.turn.ttorrent.bcodec;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestBEValuePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetLong1() throws InvalidBEncodingException {
        String receivingXML = 
        "<com.turn.ttorrent.bcodec.BEValue>" +
        "  <value class=\"big-int\">306184192</value>" +
        "</com.turn.ttorrent.bcodec.BEValue>";
        com.turn.ttorrent.bcodec.BEValue receivingObject = (com.turn.ttorrent.bcodec.BEValue) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<long>306184192</long>";
        long expectedObject = (Long) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getLong());
    }

    @Test
    public void testGetLong2() throws InvalidBEncodingException {
        String receivingXML = 
        "<com.turn.ttorrent.bcodec.BEValue>" +
        "  <value class=\"big-int\">1556363805</value>" +
        "</com.turn.ttorrent.bcodec.BEValue>";
        com.turn.ttorrent.bcodec.BEValue receivingObject = (com.turn.ttorrent.bcodec.BEValue) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<long>1556363805</long>";
        long expectedObject = (Long) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getLong());
    }
}