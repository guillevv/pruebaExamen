package ufv.dis.final2020.GVVPrueba;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

import com.google.zxing.WriterException;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        
Inventario inventario = new Inventario();
    	
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField nombre = new TextField();
        nombre.setCaption("Nombre del producto");
        
        final TextField categoria = new TextField();
        categoria.setCaption("Categoria del producto");
        
        final TextField precio = new TextField();
        precio.setCaption("Precio del producto");
        
        final TextField ean13 = new TextField();
        ean13.setCaption("Precio del producto");
        

        Button button = new Button("Click Me");
        button.addClickListener(
        		
        		e -> {
                    Producto p = new Producto(nombre.getValue(), categoria.getValue(), precio.getValue(), ean13.getValue());
                    
                    inventario.AddProduct(p);
                    
        });
        
        layout.addComponents(nombre, categoria, precio, ean13,  button);
        
        setContent(layout);
    	
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
