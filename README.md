# Práctica de laboratorio 05: Gestión de Tickets (Parqueadero)
Desarrollo de una aplicación informática para el registro de los vehículos al ingresar y salir del parqueadero

**Se pedio desarrollar una aplicación que utilice la interfaz grafica de JAVA y a la misma vez que este desarrollado utilizando el patrón de diseño MVC-DAO. Para este inicialmente creamos 7 paquetes.**

**1.	Se pedio desarrollar una aplicación que utilice la interfaz grafica de JAVA y a la misma vez que este desarrollado utilizando el patrón de diseño MVC-DAO. Para este inicialmente creamos 7 paquetes.**

	ec.ups.edu.controlador
	ec.ups.edu.dao
	ec.ups.edu.idao
	ec.ups.edu.idioma
	ec.ups.edu.modelo
	ec.ups.edu.multimedia
	ec.ups.edu.vista

a continuación, se describe el detalle en cada paquete 


**2.	ec.ups.edu.modelo**
primero se pidió crear tres clases para (Cliente, Ticket, Vehículo) cada uno con sus respectivos atributos. 

	Cliente
	Ticket
	Vehiculo


**3.	Cliente**

    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Vehiculo> vehiculos;
    
    
Esta clase tiene una agregación de con la clase vehículo. Lo cual significa que un cliente puede tener varios vehiculos y varios vehiculos pueden pertenecer a un solo cliente. También se instanciaron los métodos de: agregar,editar,eliminar,ver, y listar Vehiculos en esta clase. 


**4.	Vehiculo**

    private String placa;
    private String marca;
    private String modelo;
    private Cliente cliente;
    
    
Esta clase crea un objeto tipo vehículo y como mencionado anteriormente esta clase tiene una agregación con la clase cliente. Como tenemos un atributo de tipo cliente asignamos un vehículo a ese cliente cada vez que se instancia un nuevo vehículo. 

**5.	Ticket**

    private int numero;
    private Date fechaHoraIngreso;
    private Date fechaHoraSalida;
    private double total;
    private int fracciones;
    private int minutos;
    private Vehiculo vehiculoTicket;
    
Esta clase tiene una agregación con la clase vehículo. Lo cual significa que un ticket va a pertenecer a un auto y un auto va a pertenecer a un solo ticket. A diferencia de las dos clases anteriores se creo un método para poder calcular el total del precio a pagar del estacionamiento la cual consiste en que cada vez que pasan diez minutos desde el ingreso del vehículo se sumara un valor de 0,25 centavos.

    public void CalcularTotal() {
        long millisIngreso = fechaHoraIngreso.getTime();
        long millisSalida = fechaHoraSalida.getTime();
        long milisDiferencia = millisSalida-millisIngreso;
        milisDiferencia = milisDiferencia/60000;
        milisDiferencia=milisDiferencia+1;
        this.setMinutos(Integer.parseInt(milisDiferencia+""));
        milisDiferencia = (milisDiferencia/10)+1;         
        this.setFracciones(Integer.parseInt(milisDiferencia+""));
        this.setTotal(this.getFracciones()*0.25);

    }
    
**6.	ec.edu.ups.idao** 

en esta clase se crearon las interfaces para que puedan interactuar con el controlador y realizar las acciones deseadas del programador. 

    IClienteDAO
    IVehiculoDAO
    ITicketDAO

**7.	IClienteDAO**

En esta interfaz se instanciaron los métodos CRUD y aparte se creo un método que liste todo los clientes y otro método que retorne un cliente utilizando la placa del vehículo. 

    public List<Cliente> findAll();
    public Cliente encontrarPlaca(String placa);

**8.	ITicketDAO**
En esta interfaz se crearon los métodos CRUD y aparte se instanciaron 3 métodos. El primero método retorna una lista de tickets e indican los autos que han ingresado y han salido del parqueadero. El segundo método nos retorna el numero de tickets registrado en el sistema y es utilizado para conseguir el siguiente valor del ticket para no tener numero de tickets repetidos. El tercer método nos retorna toda la lista de tickets registrado en el sistema. 

    public List<Ticket> listaDeTicketSegunTipo(String tipo);
    public int obtenerUltimoCodigo();
    public List<Ticket> findAll(); 
    
**9.	IVehiculoDAO**
En esta interfaz se crearon los metodos CRUD. Solamente se instancio un método aparte del CRUD la cual nos retorna una lista de todos los vehiculos registrados en el sistema.

    public List<Vehiculo> findAll();
    
**10.	ec.edu.ups.controlador**
En este paquete se crearon tres clases en las cuales estas interactúan con la vista y el modelo.

	ControladorCliente
	ControladorTicket
	ControladorVehiculo
    
**11.	ControladorCliente**
En el controlador cliente se importaron los paquetes IDAO y modelo. Estas mismas fueron instanciados como atributos en el controladoCliente y en el constructor. Se crearon varios métodos para que interactúe con la interfaz del paquete vista.

crearCliente: recibe en sus parámetros los atributos de la clase Cliente y llama al DAO para que cree un nuevo cliente.

editarCliente: recibe en sus parámetros los atributos de la clase Cliente y llama al DAO que actualice los datos de ese cliente.

verCliente: recibe en sus parámetros la cedula del cliente y llama al DAO que busque ese cliente por la cedula y retorne ese cliente.

verClientePlaca: recibe en sus parámetros la placa del vehículo que esta guardado en ese cliente, llama al DAO que encuentre ese cliente por la placa y retorna ese cliente.

crearVehiculo: recibe en sus parámetros los atributos de la clase Vehiculo y aparte recibe la cedula del cliente. Primero llama al DAO y pide que lea ese cliente por la cedula, después crea un vehículo con los datos del parámetro. Luego llama al DAO de Vehículo para que cree ese nuevo vehículo. Por último guarda ese vehículo creado en el cliente y se llama al ClienteDAO para que actualice los datos de ese cliente. 

editarVehiculo: recibe en sus parámetros los atributos de la clase Vehiculo. Se crea un nuevo vehículo y esta llama al vehiculoDAO que actualice los datos de ese vehículo. También al cliente se le manda editar los datos del vehículo y se llama al ClienteDAO que actualice los datos del cliente.

buscarVehiculo: recibe en sus parámetros la placa del vehículo. Esta busca el vehículo mediante el cliente y retorna ese vehículo. 

listarVehiculos: este método retorna toda la lista de vehiculos registrado en un solo cliente. 

**12.	ControladorTicket**
En el controladorTicket se importan los paquetes IDAO y modelo. También se importan los paquetes java.util.List y java.util.Date
Se instancian como atributos todas las clases de los paquetes IDAO y modelo. Se crean varios métodos para que interactúe con la interfaz del paquete vista.

ingresoVehiculoTicket: recibe en sus atributos un Date y una placa. Este método primero consigue el numero de ticket del ticketDAO, luego llama al vehiculoDAO para que encuentre el vehículo mediante la placa. Una vez obtenido el vehículo y el numero del ticket se crea un nuevo ticket con los datos obtenidos y con el Date obtenido de los parámetros. Se llama al DAO a que cree un nuevo ticket.

salidaVehiculoTicket: recibe en sus parámetros el numero del ticket y un Date. Se llama al ticketDAO para que nos encuentre el ticket por medio del numero. Después con el Date establecemos la fecha de salida del ticket. Luego llamamos al método CalcularTicket de la clase Ticket que nos calcule el valor a pagar. Por ultimo llamamos al ticketDAO a que actualice los datos del ticket.

verTicketPorCodigo: recibe el numero del ticket en su parámetro. Llamamos al ticketDao que nos encuentre ese ticket, una vez obtenido ese ticket debemos confirmar que si exista ese ticket o si el ticketDAO nos retorno un null. Si es que nos retorno un ticket que si existe retornamos ese ticket sino retornamos null. 

listaIngresoDeTickets: llama al ticketDAO que nos retorne la lista de los vehiculos que han ingresado.

listaSalidaDeTickets:llama al ticketDAO que nos retorne la lista de vehiculos que han salido.

obtenerSiguienteCodigo: llama al ticketDao que nos consiga el ultimo código y le sumamos un valor a ese código y lo retornamos.

calcularPago: recibe en sus parámetros el código del ticket y un Date. Llamamos al ticketDAO que nos encuentre el ticket mediante el código. Después con el date configuramos la hora de salida y llamamos el método CalcularTotal de la clase Ticket para que nos calcule el valor a pagar. Por ultimo retornamos ese ticket.

listaGeneralDeTickets: llama al ticketDAO y que nos devuelva toda la lista de tickets que existen y retornamos esa lista. 

**13.	controladorVehiculo**
En el controladorVehiculo se importan todas las clases del paquete IDAO y modelo. También se importa el paquete java.util.List
Se instancian como atributos todas las clases de los paquetes IDAO y modelo. Se crean varios métodos para que interactúe con la interfaz del paquete vista.

buscarVehiculo: recibe en sus parámetros la placa del vehículo. Se llama al vehiculoDAO a que encuentre el vehículo mediante la placa y retornamos ese vehículo. 

**14.	ec.edu.ups.idioma**
En este paquete se crearon dos clases de tipo properties para poder configurar el idioma del programa. 

	mensajes_en_EU.properties
    
en esta clase se asigno un valor a una llave en el idioma ingles.

	mensajes_es_EC.properties
    
en esta clase se asigno un valor a una llave en el idioma español.

**15.	ec.edu.ups.multimedia**
En este paquete se importaron todas las imágenes se utilizarán en la interfaz al momento de visualizarlo.  
**16.	ec.edu.ups.vista**
En este paquete se crearon todas las interfaces utilizando la clase swing de java. Se utilizaron JFrameForm y JInternalFrameForm.

	VistaPrincipal.java
	VistaIngresoParqueadero.java
	VistaAgregarVehiculo.java
	VistaAgregarCliente.java
	VistaSalidaParqueadero.java
	VistaListarTickets.java
	VistaEditarDatosVehiculos.java
    
**17.	VistaPrincipal (JFrameForm)**
En esta interfaz se importaron todas las clases de los paquetes controlador, IDAO, y DAO. También se importan los siguientes paquetes: 

	java.awt.Dimension 
	java.awt.toolKit 
	java.util.Locale
	java.util.ResourceBundle
	java.util.logging.Level
	java.util.logging.Logger
	javax.swing.UIManager
	javax.swing. UnsupportedLookAndFeelException
    
En esta interfaz instanciamos como atributos todas las interfaces de tipo JInternalFrameForm, también se instanciaron todas las clases de los paquetes IDAO y controladores como atributos. Por ultimo se instanciaron las clases ResourceBundle y Locale como atributos.  
Después de que instanciemos todo las ventanas y paquetes que necesitamos, procedemos a añadirlos dentro del constructor. A las distintas vistas les pasamos como parámetros los contructores  y añadimos estas al panel. También debemos instanciar el Local y ResourceBundle dentro del constructor. 
Tenemos tres métodos distintos:

	Ocultar:  este método hace que las demás ventanas nos se visualicen y evita que el usuario tenga que estar cerrando varias ventanas. 
	setCambiarIdioma: este método cambia el idioma de los label.
	CambiarIdiomaTodasLasVentanas: este método pasa el ResourceBundle a todas las ventanas evitando la fatiga de estar declarando un ResourceBundle y Locale en todas las interfaces. 
También se ha creado distintos eventos 

	mnSalirActionPerformed: al momento que el usuario selecciona “salir” el programa se terminara. 
	mnIngresarVehiculoActionPreformed: el usuario al momento de seleccionar “Ingresar vehiculo” las demás ventanas se ocultarán y la ventana de VistaIngresoParqueadero se visualizará.
	mnSalirVehiculoActionPreformed: el usuario al momento de seleccionar “Salir Vehiculo” las demás ventanas se ocultarán y la ventana de VistaSalidaParqueadero se visualizará.
	mnListarTicketsActionPreformed: el usuario al momento de seleccionar “Lisar tickets” las demás ventanas se ocultarán y la ventana de VistaListarTickets se visualizará.
	menuItemInglesActionPreformed: se instancia un nuevo Locale con el idioma ingles y la localización de Estados Unidos. También se llama al ResourceBundle que consiga los datos del paquete de idiomas y se llama al método de cambiarIdiomaTodasLasVentanas. 
	menuItemEspañolActionPreformed: se instancia un nuevo Locale con el idioma español y la localización de Ecuador. También se llama al ResourceBundle que consiga los datos del paquete de idiomas y se llama al método de cambiarIdiomaTodasLasVentanas
 
**18.	VistaIngresoParquedero (JInternalFrameForm)**
En esta interfaz se importaron todas las clases de los paquetes controlador, IDAO, y DAO. También se importan los siguientes paquetes:

	java.awt.Dimension 
	java.text.ParseException
	java.text.SimpleDataFormat
	java.util.Calander
	java.util.Date
	java.util.ResourceBundle
	javax.swing.JOptionPane
	javax.swing.JTable
	javax.swing.table.DefaultTableModel
	
Se instanciaron todos los controladores, la VistaAgregarVehiculo, VistaEditarDatosVehiculo y aparte se instanciaron varios Strings para poder manipular el lenguaje de los optionPanel al momento de cambiar de lenguaje. 
Se crearon tres métodos todos privados.

	El primero método “setCambiarIdioma” recibe el ResourceBundle y configura el idioma de todos los label y option panel. 
	El segundo método “listarTickets” configura la información de la tabla y la actualiza cada vez. De esta manera el usuario puede visualizar los datos del vehículo y del cliente. 
	El tercer método “fechaActual” reciebe en sus parámetros un Date. Este método consigue la información de la fecha y hora del computador y lo retorna para poder configurarlo como la fecha de entrada del vehículo
	
También se creo un evento “KeyEvent” en la cual el usuario al presionar “Enter” en el teclado valida la placa que ingreso tiene el formato valido, después valida si es que la placa existe. Si cumple esta condiciones aparecerá un option panel en la cual le preguntara al usuario si quiere crear un ticket con esos datos o si desea editar los datos de ese vehículo. Si es que no cumpliera la condición apereceria un opción panel pidiéndole que cree un nuevo vehículo. Al seleccionar “si” esta cerraría le ventana de VistaIngresoParqueadero y visualizaría la ventana de vistaAgregarVehiculo.
 
**19.	VistaAgregarVehiculo (JInternalFrameForm)**
En esta interfaz se importaron todas las clases del paquete controlador. También se importan los siguientes paquetes:

	java.util.Calander
	java.util.ResourceBundle
	javax.swing.JOptionPane
	
Se instanciaron todos los controladores, la VistaAgregarCliente, VistaIngresoParqueadero y aparte se instanciaron varios Strings para poder manipular el lenguaje de los option panel al momento de cambiar de lenguaje. 
En esta interfaz se crearon 4 metodos:

	setCambiarIdioma: reciebe un ResourceBundle en su parámetro y este ayuda a cambiar el idioma de todos los labeles y option panel.
	setEditarCamposRegresarCliente: este recibe una cedula en su parametro. Esta configura que se puedan ingresar datos en las demás áreas a excepción del área donde se ingresa la cedula. 
	setVistaIngresoParqueadero: este recibe en su parámetro la VistaIngresoParqueadero. Este método solo contiene la VistaIngresoParqueadero
	setPlaca: este recibe en su parámetro una placa. Este método no permite editar los datos de los text box a excepción de la cedula. 
También se crearon dos eventos:

	btRegistrarActionPerformed: este evento primero valida que la placa que ingreso este bien formateado. Si es que no cumple con la validación pide al usuario que ingres los datos y el programa procede a validarlas. Si es que la placa que ingreso ya existe aparecerá como error. Si es que la placa que ingreso no existe procederá a crear un nuevo vehículo y crear un nuevo ticket para ese vehículo.  
	txtCedulaKeyTyped: al momento que el usuario presiona en “Enter” valida que la cedula ingresado exista, si es que existe dentro del programa permite que el usuario pueda editar los datos del vehículo. Si es que la cedula no existe el programa le pregunta al usuario si quiere registrar al cliente y se dejara de visualizar VistaAgregarVehiculo y se visualizara la ventana vistaAgregarCliente.
 
**20.	VistaAgregarCliente (JInternalFrameForm)**
En esta interfaz se importaron todas las clases del paquete controlador. También se importan los siguientes paquetes:

	java.util.ResourceBundle
	javax.swing.JOptionPane
	
Se instanciaron todos los controladores, la VistaAgregarVehiculo y aparte se instanciaron varios Strings para poder manipular el lenguaje de los option panel al momento de cambiar de lenguaje. 
En esta interfaz se crearon 4 metodos: 

	setCambiarIdioma: recibe un ResourceBundle en sus parámetros. Este método ayuda a cambiar el idioma de los labels y de los option panel. 
	limpiar: este método vacia los textbox.
	setCedulaVista: recibe en susu parámetros una cedula. Este método ayuda a pasar los datos a la siguiente vista. 
	setVistaAgregarVehiculo: en su parámetros recibe VistaAgregarVehiculo. Este ayuda a configurar las vista dentro de esta misma. 
	
También se creo un evento al momento de seleccionar el botón registrar. 

	btRegistrarActionPerformed: este evento primero valida que todos los campos este completo. Después valida si la cedula existe. Si es que la cedula existe aparecerá un panel de error, caso contrario se creará un cliente nuevo y le retornará a la vistaAgregarVehiculo.

 

