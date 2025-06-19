# ADD + Clean Architecture

## 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

**ADD (Attribute-Driven Design)** es una metodología de diseño enfocada en los **atributos de calidad** del sistema (rendimiento, seguridad, disponibilidad, escalabilidad, etc.).  
Su propósito es guiar decisiones arquitectónicas desde el inicio del proyecto para que la arquitectura cumpla con los requisitos no funcionales.

---

## 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD se aplica al inicio del proyecto para definir la arquitectura según atributos de calidad.  
Clean Architecture se utiliza en la fase de implementación para estructurar el código en capas bien definidas.  
Ambos enfoques se complementan:  
- **ADD:** qué se necesita y por qué.  
- **Clean Architecture:** cómo se implementa de forma desacoplada y mantenible.

---

## 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

1. Identificar requisitos del sistema.
2. Definir atributos de calidad clave.
3. Establecer restricciones tecnológicas.
4. Seleccionar tácticas arquitectónicas.
5. Definir módulos principales y su interacción.
6. Validar y refinar la arquitectura.

---

## 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Se identifican a partir de requisitos del sistema y del negocio.  
Ejemplos comunes:
- **Disponibilidad:** 99.9% de uptime.
- **Rendimiento:** respuesta menor a 2 segundos.
- **Seguridad:** cifrado de datos sensibles.

Son importantes porque guían el diseño hacia una arquitectura que **cumple con expectativas clave** del sistema.

---

## 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Porque Clean Architecture organiza el código en capas que separan responsabilidades y promueven el **desacoplamiento**.  
Esto facilita:
- La mantenibilidad.
- El cumplimiento de atributos de calidad.
- La evolución tecnológica sin afectar el núcleo del sistema.

---

## 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

- **Separación clara de responsabilidades.**
- **Inversión de dependencias** (las capas internas no dependen de las externas).
- **Alineación con los atributos de calidad definidos.**
- **Facilidad de prueba, despliegue y mantenimiento.**

---

## 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD vincula cada decisión técnica con un atributo de calidad que representa una **necesidad del negocio**.  
Ejemplo:  
Si el negocio exige disponibilidad constante, se seleccionan tácticas como replicación de servicios y failover automático.

---

## 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

- Diseño impulsado por calidad.
- Modularidad y desacoplamiento ideales para microservicios.
- Independencia tecnológica por servicio.
- Mayor facilidad para escalar, probar y mantener.
- Separación de capas que mejora la comprensión del sistema.

---

## 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

Mediante la fase de **validación y refinamiento**, que incluye:
- Pruebas de rendimiento y carga.
- Pruebas de seguridad.
- Identificación y eliminación de cuellos de botella.
- Optimización de código y tácticas arquitectónicas.

---

## 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

- **Pruebas de rendimiento:** JMeter, Gatling.
- **Pruebas de seguridad:** OWASP ZAP, Burp Suite.
- **Monitoreo:** Prometheus, Grafana, ELK Stack.
- **CI/CD:** Jenkins, GitHub Actions, GitLab CI/CD.
- **Revisión arquitectónica:** ADRs (Architecture Decision Records), métricas con SonarQube, revisiones por pares.

---
