import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConBoto {

    public static void main(String[] args) {
        // Crear una nueva instancia de JFrame
        JFrame frame = new JFrame("Ventana con Botón");

        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);

        // Establecer el layout del contenido de la ventana
        frame.setLayout(null);

        // Crear un nuevo botón
        JButton button = new JButton("Haz clic aquí");

        // Establecer la posición y el tamaño del botón
        button.setBounds(100, 50, 120, 30);

        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("¡Has hecho clic en el botón!");
            }
        });

        // Agregar el botón a la ventana
        frame.add(button);

        // Hacer visible la ventana
        frame.setVisible(true);

        // Cerrar la aplicación cuando se cierre la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
