	package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Concesionario {
	private String nombre;
	private String NIT;
	private ArrayList <Cliente> listaClientes = new ArrayList<>();
	private ArrayList <Empleado> listaEmpleado = new ArrayList<>();
	private ArrayList<Proveedor>listaProveedores = new ArrayList<>();
	private Administrador administrador = new Administrador("Diego",18,"1096032234","diegolopez3277@gmail.com","3042214330",null,"diego123");
	private ArrayList <Vehiculo> listaVehiculos = new ArrayList<>();
	private ArrayList <Operacion> listaOperaciones = new ArrayList<>();


	public Concesionario(String nombre, String nIT, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleado,
			ArrayList<Proveedor> listaProveedores, Administrador administrador, ArrayList<Vehiculo> listaVehiculos,
			ArrayList<Operacion> listaOperaciones) {
		super();
		this.nombre = nombre;
		NIT = nIT;
	}

	public Concesionario() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Empleado> getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}

	public ArrayList<Proveedor> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public ArrayList<Operacion> getListaOperaciones() {
		return listaOperaciones;
	}

	public void setListaOperaciones(ArrayList<Operacion> listaOperaciones) {
		this.listaOperaciones = listaOperaciones;
	}

	public boolean empleadoExistente(Empleado empleado) {
		return listaEmpleado.stream().anyMatch(x->x.equals(empleado));
	}

	public void agregarEmpleado(Empleado empleado) {
		listaEmpleado.add(empleado);

	}

	public boolean verificarCredenciales(String identificacion, String contraseña) {
		Optional<Empleado> empleadoOptional = buscarEmpleado(identificacion);
		Empleado empleado = empleadoOptional.orElse(null);
		if (empleado.getContraseña().equals(contraseña)){
			return true;
		}
		return false;
	}

	public Optional<Empleado> buscarEmpleado (String identificacion){
		return this.listaEmpleado.stream().filter(x->x.getIdentificacion().equals(identificacion)).findFirst();
	}

	public Empleado obtenerEmpleadoDeIngreso(String identificacion) {
		Optional<Empleado> empleadoOptional = buscarEmpleado(identificacion);
		Empleado empleado = empleadoOptional.orElse(null);
		return empleado;
	}

	public boolean verificarCredencialesAdministrador(String identificacion, String contraseña) {
		if(this.administrador.getIdentificacion().equals(identificacion) && this.administrador.getContraseña().equals(contraseña)){
			return true;
		}
		return false;
	}

	public int contarEmpleadoIdentificacionIgual(Empleado empleado) {
		return (int) listaEmpleado.stream().filter(x->x.getIdentificacion().equals(empleado.getIdentificacion())).count();
	}

	public boolean empleadoExistente(String identificacion) {
		return this.listaEmpleado.stream().anyMatch(x->x.getIdentificacion().equals(identificacion));
	}

	public int contarEmpleadoIdentificacionIgual(Cliente cliente) {
		return (int) listaClientes.stream().filter(x->x.getIdentificacion().equals(cliente.getIdentificacion())).count();
	}

	public void agregarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}

	public int contarProveedoresIdentificacionIgual(Proveedor proveedor) {
		return (int) listaProveedores.stream().filter(x->x.getIdentificacion().equals(proveedor.getIdentificacion())).count();
	}

	public void agregarProveedor(Proveedor proveedor) {
		listaProveedores.add(proveedor);

	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}


	public String forgotPassword(String correo){
		try {
			return mailRemember(correo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	public static String mailRemember (String destino) throws Exception {
        // Configuración del servidor de correo
        String host = "smtp.office365.com";
        String port = "587";
        String username = "ConcesionarioUQPassword@hotmail.com";
        String password = "concesionarioUQ";
        String imagenUrl = "https://i.ibb.co/CmpY1qt/Whats-App-Image-2023-05-24-at-6-31-15-PM.jpg";

        try {
            // Propiedades de la conexión
            Properties props = new Properties();

            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.port", "587");

            props.put("mail.smtp.host", host);
            props.setProperty("mail.smtp.STARTTLS.enable", "true");
            props.put("mail.smtp.ssl.trust", host);
            props.setProperty("mail.smtp.port", port);
            props.setProperty("mail.smtp.user", username);
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.ssl.protocols" , "TLSv1.2");
            props.setProperty("mail.smtp.ssl.ciphersuites", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256" );

            // Crear sesión de correo electrónico
            Session session = Session.getDefaultInstance(props);

            // Generar un código aleatorio de 5 letras
            String codigo = generarCodigoAleatorio();
            String codigoAux = codigo;

            // Cuerpo del correo con una imagen en línea y el código de verificación
            String htmlBody ="<p style=\"text-align: center;\">"
            		+ "<img src=\"" + imagenUrl + "\" width=\"300\">"
            		+ "<h2>Querido Usuario,</h2>"
                    + "<p>Hemos recibido una solicitud de recuperaci&oacuten de contrase&ntildea para su sesi&oacuten en Concesionario UQ. "
                    + "Para verificar su identidad, hemos generado un c&oacutedigo de verificaci&oacuten &uacutenico.</p>"
                    + "<p>Por favor, utilice el siguiente c&oacutedigo de verificaci&oacuten para restablecer su contrase&ntildea:</p>"
                    + "<p><strong>C&oacutedigo de verificaci&oacuten:</strong> " + generarContenidoHTML(codigo) + "</p>"
                    + "<p>Le recomendamos que copie y pegue el c&oacutedigo de verificaci&oacuten en el formulario de recuperaci&oacuten de contrase&ntildea "
                    + "para evitar errores de escritura.</p>"
                    + "<p>Si usted no solicit&oacute esta recuperaci&oacuten de contrase&ntildea, puede ignorar este correo electr&oacutenico. No se realizar&aacuten cambios en su cuenta.</p>"
                    + "<p>Por motivos de seguridad, le sugerimos que una vez que haya restablecido su contrase&ntildea, la modifique por una nueva y segura.</p>"
                    + "<p>Si necesita asistencia adicional o tiene alguna pregunta, no dude en contactarnos a trav&eacutes de LGZConcessionaire@hotmail.com</p>"
                    + "<p>Atentamente,</p>"
                    + "<p>Concesionario UQ </p>";
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
            message.setContent(htmlBody, "text/html; charset=utf-8");
            message.setHeader("Content-Type", "text/html; charset=utf-8");
            message.setHeader("Content-Transfer-Encoding", "quoted-printable");
            message.setSubject("Recuperacion de contraseña");
            message.setText(htmlBody);

            // Establecer el contenido del mensaje como HTML
            message.setContent(htmlBody, "text/html");

            Transport transport = session.getTransport();
            transport.connect(username, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null, "El mensaje se ha enviado exitosamente");
            return codigoAux;
        }catch(Exception e) {
            e.printStackTrace();

        }
        return "";
    }


    // Generar un código aleatorio de letras
    private static String generarCodigoAleatorio() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }

        return codigo.toString();
    }

    private static String generarContenidoHTML(String codigo) {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<div style=\"display: flex;\">");

        for (int i = 0; i < codigo.length(); i++) {
            htmlBuilder.append("<div style=\"border: 1px solid black; width: 40px; height: 40px; text-align: center; font-size: 20px; margin-right: 10px;\">");
            htmlBuilder.append(codigo.charAt(i));
            htmlBuilder.append("</div>");
        }

        htmlBuilder.append("</div>");

        return htmlBuilder.toString();
    }

	public void cambiarContraseña(Empleado empleado, String newPassword) {
		Optional<Empleado> empleadoEncontrado = listaEmpleado.stream().filter(x->x.equals(empleado)).findFirst();
		Empleado empleado1 = empleadoEncontrado.orElse(null);
		empleado1.setContraseña(newPassword);
	}
}
