//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // circle function because this Java doesn't has .circle function and I want to draw sth that need to use it
    public static void draw_arc(Turtle july,double radius,double angle){
        double step = 6; //go to draw 1 time 6 step faster than step = 1
        double arcLength = 2 * Math.PI * radius*(angle/360);
        int steps = (int)(angle / step);
        double stepLength = arcLength / steps;
        for (int i = 0; i < steps; i++) {
            july.forward(stepLength);
            july.left(step);
        }
    }
    //made petals for easy to use
    public static void draw_petal(Turtle july,double r,double ang){
        july.width(10);
        draw_arc(july,r,ang);
        july.left(120);
        draw_arc(july,r,ang);
        july.left(120);
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Turtle july = new Turtle();
        //water lily leaf
        july.up();
        july.home();
        july.forward(230);
        july.left(90);
        july.down();
        july.penColor("green");
        july.width(20);
        draw_arc(july,230,180);
        july.left(45);
        july.forward(100);
        july.right(90);
        july.forward(100);
        july.left(60);
        draw_arc(july,230,185);
        //water lily petal vein
        july.up();
        july.home();
        july.down();
        july.penColor("green yellow");
        july.width(10);
        for(int t=0;t<12;t++){//t=time
            if(t>=7&&t<11){
                july.forward(60);
                july.up();
                july.forward(40);
                july.down();
                july.forward(60);
                july.up();
                july.forward(40);
                july.down();
                july.forward(60);
                july.up();
                july.backward(260);
                july.down();
            }else{
                july.forward(60);
                july.up();
                july.forward(40);
                july.down();
                july.forward(60);
                july.up();
                july.backward(160);
                july.down();
            }
            july.left(30);
        }
        //Outer petal
        july.home();
        july.penColor("indian red");
        july.width(20);
        for(int i=0;i<6;i++){
            draw_petal(july,200,60);
            july.left(60);
        }
        //inner petal-layer1
        july.left(90);
        july.penColor("light coral");
        july.width(20);
        for(int i=0;i<6;i++){
            draw_petal(july,180,60);
            july.left(60);
        }
        //inner petal-layer2
        july.left(45);
        july.penColor("light pink");
        july.width(20);
        for(int i=0;i<6;i++){
            draw_petal(july,160,60);
            july.left(60);
        }
        //inner petal-layer3
        july.left(30);
        july.penColor("misty rose");
        july.width(20);
        for(int i=0;i<6;i++){
            draw_petal(july,140,60);
            july.left(60);
        }
        //water lily core
        july.home();
        july.penColor("Gold");
        july.up();
        july.forward(40);
        july.down();
        july.left(90);
        july.width(50);
        draw_arc(july,40,360);
        //water lily stamen
        july.up();
        july.home();
        july.down();
        july.width(5);
        for(int i=0;i<18;i++){
            if(i%3==0){
                july.penColor("chocolate");
                july.forward(55);
                july.backward(55);
            }else {
                july.penColor("orange");
                july.forward(45);
                july.backward(45);
            }
            july.left(20);
        }
    }
}
