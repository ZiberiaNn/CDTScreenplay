# Prueba de screenplay para Simulador de CDT Bancolombia

1. Descargar el chromedriver cuya versión sea la misma del navegador Chrome instalado y cuyo sistema operativo sea el mismo de la máquina donde se correrá la prueba: https://googlechromelabs.github.io/chrome-for-testing/
2. Pegar el chromedriver en la ruta: src/test/resources/driver. Cambiar el nombre del chromedriver a chromedriver.exe
3. Correr (preferiblemente en IntelliJ) la clase en la ruta: src/test/java/com/pruebasdesoftware/runners/CdtSimulationError.java. Esta clase corresponde al caso de prueba "Validación de Datos Errónea en la Simulación de CDT"
4. Correr (preferiblemente en IntelliJ) la clase en la ruta: src/test/java/com/pruebasdesoftware/runners/CdtSimulationSuccessful.java. Esta clase corresponde al caso de prueba "Prueba de Validación de Datos Exitosa en la Simulación de CDT"
5. Para ver los detalles de las pruebas, abrir los archivos .html que se encuentran en la ruta: target/site/serenity
