# Ian_Mery_Construyendo-una-lista-de-objetos-desde-archivo_S4

📋 Descripción del Proyecto
Sistema Java para la gestión y análisis de datos de centros de cultivo marino para Salmontt. El proyecto permite cargar, procesar y analizar información sobre producción acuícola.

🏗️ Estructura del Proyecto

```bash
proyecto-centros-cultivo/
├── resources/
│   └── cultivos.txt
└── src/
    ├── data/
    │   └── GestorDatos.java
    ├── model/
    │   └── Centro.java
    └── util/
        └── Main.java
```
🖥️ Funcionalidades:

Lee el archivo cultivos.txt desde la carpeta resources en la raíz

Parsea cada línea separada por punto y coma

Crea objetos Centro y los almacena en una lista

Maneja excepciones de lectura de archivos
