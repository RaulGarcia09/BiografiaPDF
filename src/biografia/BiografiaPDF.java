
package biografia;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;
import javax.swing.JOptionPane;


public class BiografiaPDF {
     
    public static final String destino = "C:\\Users\\Gloria Esthela\\OneDrive\\Documentos\\NetBeansProjects\\BiografiaPDF\\Biografia.pdf"; //Destino donde se creara el PDF
    public static final String foto = "C:\\Users\\Gloria Esthela\\OneDrive\\Documentos\\NetBeansProjects\\Foto.jpg";
   
    
    
    public void pdf(String dest) throws IOException{
        
    PdfWriter w = new PdfWriter(dest);
    
    PdfDocument pdf = new PdfDocument(w);
    
    Document doc = new Document(pdf);
    
    Image fotografia = new Image(ImageDataFactory.create(foto));   
  
    
    PdfFont f = PdfFontFactory.createFont(FontConstants.TIMES_ITALIC);
    
    
    Paragraph texto = new Paragraph("Raul Jesus Garcia Huitzil :)")
                    .add(fotografia)
                    .add("\nNaci el 9 de agosto del 2003  en el D.F a los 8 meses jaja, asi que fui prematuro,"
                            + "al principio todo fue dificil ya que estuve muy enfermo porque mis pulmones no se desarrollaron bien"
                            + "pero despues de 20 dias sali del hospital y me entregaron a mi familia, "
                            + "tuve una infancia divertida ya que vengo de un barrio donde casi siempre saliamos a jugar a la calle,"
                            + "y todo me gustaba el kinder a donde fui estaba cerca de mi casa y mi abuelo paterno siempre me iba recoger "
                            + "es el unico recuerdo que tengo de el pero siempre lo llevo en mi corazon y a mi abuelo materno nunca lo conoci"
                            + "mi abuela paterna y algunos de mis familiares vivian a un lado de mi casa en una vecindad y siempre jugaba"
                            + "con mis primos, me llevo muy bien con ellos, estuve 4 años en una primaria normal hasta que mis padres decidieron"
                            + "cambiarme a una escuela bilingue esto hasta salir de primaria, y en la secundaria fue mas dificil para ya que"
                            + "subi mucho de peso y durante toda la secundaria eche mucho relajo llegando a reprobar varias veces,"
                            + "despues de salir de la secundaria hice el examen para ir a una Voca pero esto no fue posible ya que "
                            + "no alcance los aciertos requeridos y me toco ir a un Conalep, ahi me deprimi mucho y mis padres me regalaron "
                            + "un Xbox One ahi me di cuenta lo que mis padres sacrifican por mi y decidi echarle muchas ganas a mis estudios,"
                            + "entre al Conalep Nezahualcoyotl III en la carrera tecnica de Alimentos y Bebidas, mis calificaciones"
                            + "fueron excelentes sacando puro 9 y 10 esto hizo que mis padres se sintieran muy orgullosos."
                            + "En mi segundo semestre de la carrera mis padres me dijeron que nos mudariamos a Toluca ya que a mi mama "
                            + "le dijeron que si no se iba para Toluca la iban a echar de su trabajo y es que mi madre siempre esta trabajando"
                            + "es contadora y lleva 20 años en esa empresa, entonces nunca iba a ganar lo que gana ahora, yo no me quise mudar con"
                            + "mis padres y me quede viviendo un semestre mas en la CDMX yoo solo."
                            + "Despues me mude con mis padres en Enero del 2020 y aqui entre a una escuela privada donde me enseñaban cocina"
                            + "los sabados tan solo 4 hrs y es que en el Conalep me enseñaban cocina 10 hrs a la semana, despues de entrar a "
                            + "esa escuela me desintereso la cocina, a los 3 meses de entrar a esa escuela cayo la pandemia, a la semana de que"
                            + "empezo la pandemia me dio Hepatitis y tuve lodo biliar esto debido a la mala alimentacion que llevaba, y que "
                            + "despues de la secundaria baje de peso dejando de comer y nada mas comia mucha comida chatarra, estuve 3 semanas"
                            + "en cama debido a estas enfermedades, aqui me sirvio para reflexionar y no darme por vencido, depues de eso entrene"
                            + "y mejore en el futbol, cuide mas mi alimentacion y trabaje ensamblando por 6 meses."
                            + "Despues me mude de nuevo pero ahora al centro de Toluca aqui cuando sali de la preparatoria no sabia que estudiar"
                            + " y me decidi por una carrera en la cual se vea mucho en el futuro y decidi Ingenieria en Computacion."
                            + "Aqui en la universidad eh hecho muy buenos amigos, ahora en las mañanas voy a la escuela, en las tardes voy al gym"
                            + "con uno de mis mejores amigos y en la noche hago tarea.");
                    
              
    
    doc.add(texto);
    doc.close();
    
    
    JOptionPane.showMessageDialog(null,"PDF CREADO");       
        
    }
    public static void main(String[] args) throws IOException {
        
        new BiografiaPDF().pdf(destino);
        
        
    }
}
