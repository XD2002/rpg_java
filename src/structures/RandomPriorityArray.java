package structures;

import java.util.ArrayList;
import java.util.Random;

public class RandomPriorityArray<T> {
    private final ArrayList<T>[] priorityArray;
    private final int triangleSize;
    private int size;

    public RandomPriorityArray(int numPriorities){
        priorityArray = new ArrayList[numPriorities];
        for(int i=0; i<numPriorities; i++){
            priorityArray[i] = new ArrayList<>();
        }
        triangleSize = numPriorities * (numPriorities + 1)/2;
        System.out.println(triangleSize);
        size = 0;
    }

    public void add(T object, int priority){
        ArrayList<T> list = priorityArray[priority];
        list.add(object);
        size++;
    }

    public T getRandom(){
        if(size == 0){
            throw new RandomPriorityArrayEmptyException();
        }
        Random r = new Random();

        int randomIndex = 1;
        ArrayList<T> randomList = new ArrayList<>();

        while(randomIndex > randomList.size()){
            int randomLocTriangle= r.nextInt(triangleSize);
            int randomPriority = (int) (Math.sqrt(8*randomLocTriangle+1)-1)/2;
            randomList = priorityArray[randomPriority];
        }

        randomIndex = r.nextInt(randomList.size());
        return randomList.get(randomIndex);
    }

    public T getRandomAndDelete(){
        if(size == 0){
            throw new RandomPriorityArrayEmptyException();
        }
        Random r = new Random();

        int randomIndex = 1;
        ArrayList<T> randomList = new ArrayList<>();

        while(randomIndex > randomList.size()){
            int randomLocTriangle= r.nextInt(triangleSize);
            int randomPriority = (int) (Math.sqrt(8*randomLocTriangle+1)-1)/2;
            randomList = priorityArray[randomPriority];
        }

        randomIndex = r.nextInt(randomList.size());
        T object = randomList.get(randomIndex);
        randomList.remove(object);
        size--;
        return object;
    }
}
