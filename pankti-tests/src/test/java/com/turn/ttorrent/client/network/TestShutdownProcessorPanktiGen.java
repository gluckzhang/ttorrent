package com.turn.ttorrent.client.network;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestShutdownProcessorPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testProcessAndGetNext1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext1-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext2-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext3-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext4-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext5-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext6-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext7-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }

    @Test
    public void testProcessAndGetNext8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<com.turn.ttorrent.client.network.ShutdownProcessor/>";
        com.turn.ttorrent.client.network.ShutdownProcessor receivingObject = (com.turn.ttorrent.client.network.ShutdownProcessor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        com.turn.ttorrent.client.network.DataProcessor expectedObject = (com.turn.ttorrent.client.network.DataProcessor) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("com.turn.ttorrent.client.network.ShutdownProcessor.processAndGetNext8-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        java.nio.channels.ByteChannel paramObject1 = (java.nio.channels.ByteChannel) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.processAndGetNext(paramObject1));
    }
}