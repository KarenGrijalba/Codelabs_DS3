## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito principal de **Clean Architecture** es organizar el código en capas claramente separadas por responsabilidades, promoviendo el **desacoplamiento** entre la lógica de negocio y los detalles técnicos (frameworks, bases de datos, interfaces, etc.). Esto facilita la escalabilidad, mantenibilidad, pruebas y comprensión del sistema.

---

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

- Desacoplamiento entre capas (dominio, aplicación, infraestructura).
- Independencia tecnológica, permitiendo cambiar frameworks o bases de datos sin afectar la lógica.
- Modularidad y reutilización de la lógica de negocio.
- Facilita el testeo unitario y pruebas independientes por capa.
- Promueve el principio de responsabilidad única (SRP - SOLID).
- Mejora la escalabilidad y el trabajo en equipo en proyectos grandes.

---

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

| Capa               | Responsabilidad principal                                                                 |
|--------------------|--------------------------------------------------------------------------------------------|
| **Dominio**        | Reglas de negocio puras, entidades y objetos de valor. Sin dependencias externas.         |
| **Aplicación**     | Casos de uso, lógica de aplicación y orquestación. Usa interfaces para interactuar.       |
| **Infraestructura**| Implementaciones técnicas: repositorios JPA, servicios externos, configuración de Spring. |
| **Presentación**   | Controladores (REST, Web), autenticación/autorización, validaciones.                      |

---

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Para evitar que los **detalles técnicos como JPA, bases de datos o APIs externas afecten el núcleo del negocio**, lo que permite:

- Cambiar tecnologías sin modificar la lógica del negocio.
- Facilitar pruebas unitarias (mock de interfaces).
- Mantener un dominio limpio, entendible y reutilizable.

---

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

La **capa de aplicación**:

- Orquesta los casos de uso.
- Coordina la interacción entre el dominio y la infraestructura.
- Contiene lógica de aplicación (ej: flujos de procesos, validaciones específicas de uso).
- No depende de frameworks, solo de interfaces definidas en el dominio.

---

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

| Aspecto         | Service (sin UseCase)                               | UseCase                                      |
|-----------------|------------------------------------------------------|----------------------------------------------|
| Función         | Contiene lógica de negocio y de aplicación mezclada | Maneja un caso específico de uso             |
| Escalabilidad   | Menos modular                                        | Más modular, se puede extender fácilmente    |
| Pruebas         | Más difícil de probar por estar acoplado            | Fácil de probar por su aislamiento           |
| Acoplamiento    | Mayor (puede depender de JPA o frameworks)          | Menor, trabaja con interfaces del dominio    |

---

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

- Para que la lógica del dominio **no dependa de JPA ni de frameworks**.
- Se respetan los principios de **inversión de dependencias (D de SOLID)**.
- Permite que la infraestructura implemente la interfaz sin modificar el dominio.
- Mejora la **flexibilidad y testeo**, usando mocks en tests de aplicación o dominio.

---

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

**Ejemplo de implementación:**

```java
@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.findAll();
    }
}
---

## Ventajas de implementar UseCases

- Aislamiento de la lógica de negocio.
- Modularidad: un caso de uso por clase.
- Controladores sin lógica de negocio.
- Fácil incorporación de nuevas reglas o cambios.

---

## 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- Código acoplado a tecnologías (JPA, Spring, etc.).
- Dificultad para escalar o migrar tecnologías.
- Controladores con lógica de negocio confusa.
- Poca reutilización y duplicación de código.
- Dificultad para realizar pruebas unitarias.
- Mantenimiento complicado con riesgo de errores al modificar funcionalidades.

---

## 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

- Permite **modificar o extender funcionalidades** sin romper otras partes del sistema.
- Facilita la **reutilización de lógica** en distintos controladores o servicios.
- Las **capas bien definidas** ayudan a que cada equipo trabaje en una parte diferente del sistema.
- Mejora el **onboarding de nuevos desarrolladores**, ya que la estructura es clara y predecible.
- Promueve la **evolución tecnológica**, permitiendo cambiar herramientas sin reescribir la lógica de negocio.

---

