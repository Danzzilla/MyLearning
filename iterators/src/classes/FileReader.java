package classes;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Daniel Svirida
 * @version 1
 */
public class FileReader{

    private String file;

    /**
     * custructor class
     * @param file file to be read
     */
    public FileReader(String file){
        this.file = file;
    }

    /**
     * Iterator
     * @return Iterator
     */
    public Iterator<String> iterator(){
        return new FileReaderIterator();
    }

    /**
     * for the file reader iterator
     */
    private class FileReaderIterator implements Iterator<String> {

        Scanner scanner;

        public FileReaderIterator(){
            scanner = new Scanner(file);
        }
        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return scanner.hasNextLine();
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public String next() {
            if(!hasNext()){
                throw new NoSuchElementException("No more elements");
            }

            return scanner.nextLine();
        }

        @Override
        public String toString() {
            return "FileReaderIterator{" +
                    "scanner=" + scanner +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "FileReader{" +
                "file='" + file + '\'' +
                '}';
    }
}
