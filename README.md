
#Aplicação utilizando Java EE, H2 e AngularJS.

#Requisitos
- JVM 1.8;
- Container (Wildfly 8.x.x ou superior);
- Apache Maven.

#Tecnologias de Backend	(JEE 7):
- JAX-RS (Processamento da camada de API REST da aplicação);
- CDI (Criação dos objetos DAO);
- JPA (Camada de persistência);
- H2 (Banco de dados embarcado já disponível no Widlfly).
				
#Tecnologias de FrontEnd
- Bootstrap (Estrutura da UI);
- AngularJS (Criação das lógias da camada UI e integrção com Backend).
			
#Como Utilizar
- Utilizar a IDE de preferência, importar como <b>Maven Project</b>;
- Executar <b>clean package</b> e realizar o deploy do artefato .war no Container Wildfly 8.x.x.
