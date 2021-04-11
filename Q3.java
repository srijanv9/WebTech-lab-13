import java.applet.Applet;
import java.awt.*;
 
public class Q3 extends java.applet.Applet {
    public void init() 
    {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new Label("Name          :"), 50, 100);
        add(new TextField(10), 50, 120);

        add(new Label("Address       :"), 50, 140);
        add(new TextField(10), 50, 160);
        
        add(new Label("Birthday      :"), 50, 180);
        add(new TextField(10), 50, 200);

        add(new Label("Gender        :"), 50, 220);
        Choice gender = new Choice(); 
        gender.addItem("Man"); 
        gender.addItem("Woman"); 
        Component add = add(gender);  

        add(new Label("Job            :"), 50, 240);
        CheckboxGroup job = new CheckboxGroup();
        add(new Checkbox("Student", job, false));
        add(new Checkbox("Teacher", job, false));

        add(new Button("Register"), 50,260);
        add(new Button("Exit"), 50, 270);

        add(new Label("Comments       :"));

    }
}

/*
<applet code = "Q3.class" width = "320" height = "120"></applet>
*/