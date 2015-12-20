import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    /**
     * Se introduce un numero y comprueba que si es un indice valido para el atributo files. 
     * Si el parametro no es valido muestra un error por pantalla e indica el rango valido.
     */
    public void checkIndex(int index)
    {
        if(index >=0 && index < files.size()) {            
        }
        else {
            System.out.println("El parametro introducido no es valido. Debe estar entre 0 y " + (files.size() - 1));
        }
    }
    
    /**
     * Devuelve un valor booleano en función de si su parámetro entero es un índice válido o no para el atributo files.
     */
    public boolean validIndex(int index)
    {
        boolean valorBueno = false;
        if(index >=0 && index < files.size()) {        
            valorBueno = true;
        }
        return valorBueno;
    }
}
