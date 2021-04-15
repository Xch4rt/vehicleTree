/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.frame.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import prog.uni.frame.JTree;
import prog.uni.pojo.Vehicle;
/**
 *
 * @author Pablo
 */
public class JTreeController {
    private JTree frmTree;
    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private List<Vehicle> vehicles;
    public JTreeController(JTree frmJTree)
    {
        this.frmTree = frmTree;
        initComponent();
    }
    
    public void initComponent()
    {
        root = new DefaultMutableTreeNode("Vehicles");
        createNodes(root);
        frmTree = new JTree();
        treeModel = new DefaultTreeModel(root);
        JScrollPane paneView = new JScrollPane(frmTree);
        frmTree.getJTree().setModel(treeModel);
        
    }
    public void createNodes(DefaultMutableTreeNode root)
    {
        DefaultMutableTreeNode category = new DefaultMutableTreeNode("Books for Java Programmers");
        DefaultMutableTreeNode book = null;
        
        root.add(category);
        
        book = new DefaultMutableTreeNode( vehicles = Arrays.asList(new Vehicle(1, 2020, "Mazda","Model")));
        category.add(book);
        
        
        
    }
    public void ListVehicles()
    {
        //List<Vehicle> vehicles; // = Arrays.asList(new Vehicle(1, 2020, "Mazda","Model"));
        
        Map<String, List<Vehicle>> vehicleByIDK = vehicles.stream().collect(Collectors.groupingBy(Vehicle::getMake));
        
        for (Map.Entry<String, List<Vehicle>> entry: vehicleByIDK.entrySet()) 
        {
            System.out.println("Vehicle "+entry.getKey() + " " + entry.getValue());
        }
    }
}
