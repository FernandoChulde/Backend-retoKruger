# Backend-retoKruger
La parte del backend se realizo con el framework spring,  el lenguaje de java.
En la construcción del backend como primer paso se realizo el diseño de la base de datos, se encuentra adjunto en la carpeta BD el modelado y el backup.
La base de datos utilizada fue postgresql con el administrador pg-admin, para la creación de la base de datos se ejecuto con ayuda del application.propierties.
La arquitectura utilizada consta del model, el cual contiene las entities de las tablas de la base de datos, el repository es el encargado de resolver el accesso de los datos del microservicio, en el service se realiza los metodos encargados de realizar el CRUD, o la lógica del backend, por último tenemos el rest, aquí es donde se despliega el servicio del API.
También se implemento swagger2 para la documentación del API rest (http://localhost:8080/swagger-ui/index.html).
