# OpenAPI Specification & Swagger Tools - Zero To Master

[![Image](https://github.com/eazybytes/openapi/blob/main/openapi.png "OpenAPI Specification &amp; Swagger Tools - Zero To Master")](https://www.udemy.com/course/openapi-specification-swagger-tools-zero-to-master/?referralCode=F002A9A799DB126CD189)

**'OpenAPI Specification & Swagger Tools - Zero To Master'** course will help in understanding about Open API Specification and how to describe, document APIs using OpenAPI & Swagger tools.

Github: [Repository][github-repo-url]

Course: [Udemy Course][udemy-course-url]

Swagger Project: https://walyson-scarazzati.github.io/openapi/


## Topics covered in the course

1) Designing APIs with OpenAPI Specifications and Swagger Tools
2) Describing, Documenting APIs details using OpenAPI Specifications
3) History of OpenAPI & Swagger and relation between them
4) Details about Swagger tools like Swagger Editor, Swagger UI,SwaggerHub,SwaggerHub Explore,Swagger Codegen etc.
5) How to get started with OpenAPI in code first & Design first scenarios
6) How to write a valid OpenAPI document using YAML syntax
7) Writing re-usable content inside Open API specification with components
8) Data types supported by Open API specification & their details
9) Inheritance & polymorphism inside OpenAPI with keywords oneOf, anyOf, allOf and not
10 ) How to describe APIs security inside Open API specification
11) How to mock APIs with Open API specification & Prism mock server
12) How to generate client code & server stubs using OpenAPI for various popular programming languages & frameworks
13) Deploying & Hosting Open API specification inside a GitHub page along with Swagger UI
14) Providing examples data for the APIs inside Open API specification
15) Advantages of using Open API specification 
16) Providing better documentation using CommonMark syntax inside Open API specification 

## Pre-requisite for the course

- Basic knowledge on APIs
- Interest to learn and explore about OpenAPI & Swagger tools

# Important Links

- Open API Website - https://www.openapis.org
- Swagger Website - https://swagger.io
- Swagger Editor - https://editor.swagger.io
- SwaggerHub Explore - https://explore.swaggerhub.com/
- OpenAPI Map - https://openapi-map.apihandyman.io/
- OpenAPI & SpringBoot library - https://springdoc.org
- List of OpenAPI tools - https://openapi.tools/
- Prism Mock server - https://stoplight.io/open-source/prism
- SWAPI The Star Wars API - https://swapi.dev/
- REQRES Mock APIs - https://reqres.in

# Project layout

This repository contains the OpenAPI specification plus several sample projects built from it:

| Path | What it is |
|---|---|
| `openapi.yml` | The OpenAPI 3.1 specification for the EazyShop API |
| `index.html` | Static Swagger UI page that renders `openapi.yml` (used for GitHub Pages hosting) |
| `eazyshop-server` | Spring Boot server stubs generated once via the `openapi-generator` **CLI** |
| `eazyshop-server-maven` | Spring Boot server (Java 21) that regenerates its API/model classes from `openapi.yml` on every Maven build, via the `openapi-generator-maven-plugin` |
| `eazyshop-client` | JavaScript client SDK generated from `openapi.yml` |
| `springboot-openapi-demo/OpenAPI` | Demo of documenting a hand-written Spring Boot app with `springdoc-openapi` (code-first approach) |

# Run Swagger UI and Swagger Editor with Docker Compose

The Compose file starts Swagger UI and Swagger Editor with `openapi.yml`
loaded. Swagger Generator is the code-generation API used by tools; it is not
a browser interface.

```sh
docker compose up -d
```

- Swagger UI: http://localhost:8080
- Swagger Editor (carrega a especificação): http://localhost:8081/?url=/openapi.yml
- Swagger Generator API: http://localhost:8082

The OpenAPI file is mounted read-only into both UI containers. The
`swaggerapi/swagger-generator` image provides the Swagger 2 code-generation
API; it does not generate clients from this OpenAPI 3.1 document. Stop the
services with:

```sh
docker compose down
```

# Run `eazyshop-server` (CLI-generated server stubs)

Pre-generated Spring Boot stubs (Java 17). No regeneration happens on build.

```sh
cd eazyshop-server
./mvnw spring-boot:run
```

App starts on http://localhost:8080. Swagger UI (via springdoc): http://localhost:8080/swagger-ui.html

# Run `eazyshop-server-maven` (Maven-plugin-generated server)

Regenerates API/model classes from `../openapi.yml` into `src/main/java` on every build (Java 21).

```sh
cd eazyshop-server-maven
mvn generate-sources   # regenerate .java classes from openapi.yml only
mvn spring-boot:run    # regenerate + build + run
```

App starts on http://localhost:8080. Hand-written logic lives in the `*ApiController.java`
files — they are never overwritten by regeneration once they exist.

# Run `eazyshop-client` (generated JS client SDK)

```sh
cd eazyshop-client
npm install
npm run build
```

This builds the library from `src` into `dist` using Babel. To use it from
another local project, run `npm link` and then `npm link eazyshop-client` in
that project (see `eazyshop-client/README.md` for full details).

# Run `springboot-openapi-demo/OpenAPI` (code-first springdoc demo)

```sh
cd springboot-openapi-demo/OpenAPI
./mvnw spring-boot:run
```

App starts on http://localhost:8080. Swagger UI: http://localhost:8080/swagger-ui.html

[github-repo-url]: https://github.com/eazybytes/openapi
[udemy-course-url]: https://www.udemy.com/course/openapi-specification-swagger-tools-zero-to-master/?referralCode=F002A9A799DB126CD189
