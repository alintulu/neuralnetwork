/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import Neuralnetwork.Network;
import Neuralnetwork.Main;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alintulu
 */
public class NeuralNetworkTest {
    
    Main nn;
    
    public NeuralNetworkTest() {
        nn = new Main();
    }

    /**
     * Test of makeNetwork method, of class NeuralNetwork.
     */
    @Test
    public void testMakeNetwork() {
        System.out.println("Testing makeNetwork..");
        int numInputs = 2;
        int numHiddenLayers = 2;
        int numInEachLayer = 2;
        Network result = Main.makeNetwork(numInputs, numHiddenLayers, numInEachLayer);
        
        assertTrue(result.inputNodes.size() == numInputs);
        assertEquals("outputNode", result.outputNode.getName());
    }

    /**
     * Test of func method, of class NeuralNetwork.
     */
    @Test
    public void testFunc() {
        System.out.println("Testing func..");
        double x = 0.5;
        System.out.println("testfunc value: " + nn.func(x));
        assertTrue(nn.func(x) < 1 && nn.func(x) > 0);
    }

    /**
     * Test of sineTest method, of class NeuralNetwork.
     */
    @Test
    public void testSineTest() {
        System.out.println("Testing sineTest..");
        int numValues = 10;
        assertTrue(Main.sineTest(numValues).size() == numValues);
    }

    /**
     * Test of main method, of class NeuralNetwork.
     */
    @Test
    public void testMain() {
        System.out.println("Testing main..");
        String[] args = null;
        Main.main(args);
    }
    
}
