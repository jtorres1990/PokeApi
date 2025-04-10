# 🧪 SOAP Pokémon Service

Este proyecto expone un servicio SOAP en Java 17 con Spring Boot que permite consultar información de Pokémon desde la PokéAPI y, opcionalmente, almacenar o consultar esa información desde una base de datos.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web Services (SOAP)
- Spring Data JPA (para operaciones con BD)
- Feign Client (para consumir la PokéAPI)
- Oracle Database 21c
- JAXB (para serializar/deserializar XML)
- MapStruct (opcional para mapeo DTO ↔ entidad)

---

## 📦 Estructura del proyecto

```bash
src/main/java
└── com/pokemon/pokeapi
    ├── endpoint          # Endpoints SOAP
    ├── configuration     # configuracion de WSDL
    ├── exception         # Excepciones personalizadas
    ├── jaxb              # Clases JAXB (request/response)
    ├── model.dto         # DTOs intermedios
    ├── model.mapper            # MapStruct o mappers manuales
    ├── jpa.entity        # Entidades JPA
    ├── jpa.repository    # Interfaces de acceso a datos
    ├── service           # Lógica de negocio
    └── client.pokeapi    # Cliente Feign para PokéAPI
```

---

## 📚 Operaciones SOAP disponibles

### 1. `BuscarPokemon`

Consulta un Pokémon por nombre en la PokéAPI.

```xml
<BuscarPokemonRequest>
  <nombre>bulbasaur</nombre>
</BuscarPokemonRequest>
```

### 2. `BuscarTodos`

Consulta todos los Pokémon paginados desde PokéAPI.

```xml
<BuscarTodosRequest>
  <offset>0</offset>
  <limit>100</limit>
</BuscarTodosRequest>
```

### 3. `BusquedaAvanzada` (Solo desde BD)

Filtra por nombre, habilidad y tipo (requiere conexión a BD).

```xml
<PokemonResumenRequest>
  <pokemonName>bulbasaur</pokemonName>
  <abilityName>overgrow</abilityName>
  <typeName>grass</typeName>
</PokemonResumenRequest>
```

---

## 📄 Acceso al WSDL

Una vez iniciado el proyecto, puedes acceder al WSDL en:

```
http://localhost:8080/ws/pokemon.wsdl
```

---

## ⚙️ Configuración de base de datos Oracle

Asegúrate de tener un usuario con permisos en el tablespace `USERS`:

```sql
ALTER USER POKEMON QUOTA UNLIMITED ON USERS;
```

Y que tenga privilegios de conexión y creación:

```sql
GRANT CONNECT, RESOURCE TO POKEMON;
```

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:
```bash
   git clone https://github.com/jtorres1990/PokeApi.git
```

2. Compila el proyecto:
```bash
   mvn clean install
```

3. Ejecuta:
```bash
  mvn spring-boot:run
```

---

## 🧪 Cómo probar

Puedes probar los servicios usando:

- [SoapUI](https://www.soapui.org/)
- Postman (modo SOAP)
- cURL
- Navegador (para visualizar el WSDL)

---

## 🧠 Patrones de diseño aplicados

- **Mapper Pattern**: conversión DTO ↔ entidad ↔ JAXB.
- **Query by Example (QBE)**: búsquedas filtradas en BD.
- **Repository Pattern**: separación de la lógica de persistencia.
- **Service Layer**: encapsulamiento de lógica de negocio.

---

## 📌 Recomendaciones

- Si usas MapStruct, asegúrate de que los campos coincidan exactamente o usa `@Mapping`.
- Para evitar errores con JAXB, asegúrate de que todas las clases JAXB tienen getters/setters, namespace y están bien anotadas.
- Crea un archivo `package-info.java` en cada paquete JAXB con el namespace predeterminado para evitar errores de binding.

---

## ✨ Autor

Proyecto desarrollado por John Jairo Torres Corredor  
Contacto: zombra18@gmail.com