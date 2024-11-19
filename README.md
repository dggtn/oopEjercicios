<header>
      <h1>Ejercicios JAVA - Paradigma Orientado a Objetos (POO)</h1>
      <p><strong>Universidad Argentina de la Empresa (UADE) | Año 2023</strong></p>
  </header>

  <section>
      <h2>Descripción del Proyecto</h2>
      <p>Este proyecto contiene una serie de ejercicios prácticos para aprender y afianzar los conceptos del Paradigma Orientado a Objetos (POO) utilizando el lenguaje de programación <strong>Java</strong>.</p>
      <p>Los ejercicios cubren diversos aspectos de la programación orientada a objetos, como la creación de clases, objetos, herencia, polimorfismo, encapsulamiento, interfaces y clases abstractas.</p>
  </section>

  <section>
      <h2>Objetivos del Proyecto</h2>
      <ul>
          <li>Practicar la creación de clases y objetos en Java.</li>
          <li>Implementar los principios fundamentales del POO: encapsulamiento, herencia, polimorfismo y abstracción.</li>
          <li>Trabajar con interfaces y clases abstractas.</li>
          <li>Aplicar la gestión de excepciones en un contexto orientado a objetos.</li>
      </ul>
  </section>

  <section>
      <h2>Tecnologías Utilizadas</h2>
      <ul>
          <li><strong>Java 8+</strong>: Lenguaje de programación utilizado para implementar los ejercicios orientados a objetos.</li>
          <li><strong>IDE IntelliJ IDEA / Eclipse</strong>: Herramientas de desarrollo utilizadas para escribir y ejecutar el código.</li>
          <li><strong>Git</strong>: Sistema de control de versiones para gestionar el código fuente.</li>
      </ul>
  </section>

  <section>
      <h2>Instrucciones para Ejecutar el Proyecto</h2>
      <p>Para ejecutar este proyecto en tu máquina local, sigue los pasos a continuación:</p>
      <ol>
          <li><strong>Clona el repositorio:</strong>
              <pre>git clone https://github.com/tu_usuario/oopEjercicios-JAVA.git</pre>
          </li>
          <li><strong>Accede al directorio del proyecto:</strong>
              <pre>cd oopEjercicios-JAVA</pre>
          </li>
          <li><strong>Compila y ejecuta el proyecto:</strong>
              <pre>javac *.java</pre>
              <pre>java Main</pre>
          </li>
      </ol>
  </section>

  <section>
      <h2>Ejemplos de Ejercicios</h2>
      <p>A continuación se presentan algunos ejemplos de ejercicios que cubren conceptos clave del Paradigma Orientado a Objetos:</p>
      
      <h3>Ejemplo 1: Creación de Clases y Objetos</h3>
      <p>En este ejercicio se crea una clase llamada <code>Persona</code> que tiene atributos y métodos para interactuar con los datos de la persona.</p>
      <pre>
public class Persona {
  private String nombre;
  private int edad;

  // Constructor
  public Persona(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
  }

  // Métodos getter y setter
  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getEdad() {
      return edad;
  }

  public void setEdad(int edad) {
      this.edad = edad;
  }

  public void saludar() {
      System.out.println("¡Hola! Soy " + nombre + " y tengo " + edad + " años.");
  }

  public static void main(String[] args) {
      Persona persona1 = new Persona("Juan", 30);
      persona1.saludar();
  }
}
      </pre>
      <p>Este ejercicio crea una clase <code>Persona</code> con un constructor, atributos privados, métodos getter/setter y un método para saludar. Luego, crea un objeto de la clase y llama al método <code>saludar()</code>.</p>

      <h3>Ejemplo 2: Herencia y Polimorfismo</h3>
      <p>Este ejercicio muestra cómo crear clases que heredan de otras y cómo implementar polimorfismo.</p>
      <pre>
class Animal {
  public void hacerSonido() {
      System.out.println("El animal hace un sonido.");
  }
}

class Perro extends Animal {
  @Override
  public void hacerSonido() {
      System.out.println("El perro ladra.");
  }
}

public class Main {
  public static void main(String[] args) {
      Animal animal = new Animal();
      animal.hacerSonido();

      Perro perro = new Perro();
      perro.hacerSonido();
  }
}
      </pre>
      <p>En este ejercicio, se muestra la herencia en acción: la clase <code>Perro</code> hereda de la clase <code>Animal</code> y sobrescribe el método <code>hacerSonido()</code> para mostrar un comportamiento diferente.</p>

      <h3>Ejemplo 3: Interfaces</h3>
      <p>Este ejercicio muestra cómo implementar una interfaz en Java.</p>
      <pre>
interface Vehiculo {
  void acelerar();
  void frenar();
}

class Coche implements Vehiculo {
  public void acelerar() {
      System.out.println("El coche acelera.");
  }

  public void frenar() {
      System.out.println("El coche frena.");
  }
}

public class Main {
  public static void main(String[] args) {
      Vehiculo coche = new Coche();
      coche.acelerar();
      coche.frenar();
  }
}
      </pre>
      <p>En este ejercicio, se crea una interfaz <code>Vehiculo</code> con métodos que deben ser implementados por cualquier clase que la implemente. La clase <code>Coche</code> implementa la interfaz y define los métodos <code>acelerar()</code> y <code>frenar()</code>.</p>

      <h3>Ejemplo 4: Clases Abstractas</h3>
      <p>Este ejercicio muestra cómo crear y utilizar clases abstractas en Java.</p>
      <pre>
abstract class Figura {
  abstract void dibujar();
}

class Circulo extends Figura {
  void dibujar() {
      System.out.println("Dibujando un círculo.");
  }
}

public class Main {
  public static void main(String[] args) {
      Figura figura = new Circulo();
      figura.dibujar();
  }
}
      </pre>
      <p>En este ejercicio, la clase <code>Figura</code> es abstracta y define un método abstracto <code>dibujar()</code>. La clase <code>Circulo</code> extiende de <code>Figura</code> y proporciona su implementación del método abstracto.</p>
  </section>

  <section>
      <h2>Contribuciones</h2>
      <p>Si deseas contribuir al proyecto o agregar nuevas funcionalidades, puedes seguir estos pasos:</p>
      <ol>
          <li><strong>Haz un fork del repositorio:</strong> Crea una copia del proyecto en tu propio repositorio.</li>
          <li><strong>Crea una nueva rama:</strong> Asegúrate de trabajar en una nueva rama para tus cambios.
              <pre>git checkout -b feature/nueva-funcionalidad</pre>
          </li>
          <li><strong>Realiza los cambios:</strong> Haz las modificaciones necesarias en tu rama de trabajo.</li>
          <li><strong>Haz commit de tus cambios:</strong>
              <pre>git commit -m "Descripción de los cambios realizados"</pre>
          </li>
          <li><strong>Sube tus cambios:</strong>
              <pre>git push origin feature/nueva-funcionalidad</pre>
          </li>
          <li><strong>Abre un pull request:</strong> Una vez que hayas subido tus cambios, abre un pull request para que los revisemos y los fusionemos con la rama principal.</li>
      </ol>
  </section>

  <section>
      <h2>Licencia</h2>
      <p>Este proyecto está bajo la licencia <strong>MIT</strong>. Puedes ver los detalles completos en el archivo <code>LICENSE</code>.</p>
  </section>

  <section>
      <h2>Agradecimientos</h2>
      <p>Agradecemos a la <strong>Universidad Argentina de la Empresa (UADE)</strong> por ofrecer este curso sobre el Paradigma Orientado a Objetos y por proporcionar los recursos necesarios para llevar


