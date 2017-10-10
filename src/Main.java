import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLXARBCreateContextProfile;

import static ExtraUtilities.OutStream.*;

public class Main {
    public static void main (String [] args){
//        int context = GLXARBCreateContextProfile.GLX_CONTEXT_CORE_PROFILE_BIT_ARB;
//        GLCapabilities glCapabilities = GL.createCapabilities();

        GLFW.glfwInit();
        long window = GLFW.glfwCreateWindow(400, 400, "this is a test", 0, 0);
        GLFW.glfwMakeContextCurrent(window);
        println(window);
        GLFW.glfwShowWindow(window);
        while(true){

            print(5);
            if(window  > 0)
                break;
            //second thing
        }
        //adding motion
    }

}
