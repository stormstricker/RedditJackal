package redditjackal.entities;

import java.util.*;

public class Util {
    public static void main(String[] args) {
        HashMap<String, Long> map = new HashMap<>();
        map.put("Dog" , 1L);
        map.put("Cat", 2L);
        map.put("Mouse", 3L);

        LinkedHashMap<String, Long> result = sortHashMap(map, "desc");
        System.out.println(result) ;

        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 11);
        map2.put(2, 22);
        map2.put(3, 33);

        System.out.println(sortHashMap(map2, "desc"));
    }

    public static <K, V extends Comparable<V>> LinkedHashMap<K, V>
                sortHashMap(HashMap<K, V> unsortedMap, String type)  {
        LinkedHashMap<K, V> result = new LinkedHashMap<>();

        ArrayList<K> sortedKeys = new ArrayList<>();
        for (K key: unsortedMap.keySet())  {
            sortedKeys.add(key);
        }

        //Long minSoFar = unsortedMap.get(unsortedMap.keySet().iterator().next());
        for (int i=0; i<unsortedMap.size(); i++)  {
            for (int j=1; j<sortedKeys.size(); j++)  {
                boolean flag;
                if (type.equals("desc"))  {
                    flag = unsortedMap.get(sortedKeys.get(j)).compareTo(unsortedMap.get(sortedKeys.get(j-1))) > 0;
                }
                else  {
                    flag = unsortedMap.get(sortedKeys.get(j)).compareTo(unsortedMap.get(sortedKeys.get(j-1))) < 0;
                }

                if (flag) {
                    K temp = sortedKeys.get(j);
                    sortedKeys.set(j, sortedKeys.get(j-1));
                    sortedKeys.set(j-1, temp);

                }
            }
        }

        //System.out.println("sortedKeys: " + sortedKeys);
        for (K key: sortedKeys)  {
            result.put(key, unsortedMap.get(key));
        }

        return result;
    }


    public static <K, V> LinkedHashMap<K, Map<K, V>>
                            sortHashMapArray(Map<K, Map<K, V>> unsortedMap, boolean something)  {
        Map<K, ArrayList<K>> collectionMap = new HashMap<K, ArrayList<K>>();

        for (K key: unsortedMap.keySet())  {
            ArrayList<K> list = new ArrayList<K>(unsortedMap.get(key).keySet());

            collectionMap.put(key, list);
        }

        LinkedHashMap<K, ArrayList<K>> result =  sortHashMapArray(collectionMap);

        LinkedHashMap<K, Map<K, V>> realResult = new LinkedHashMap<>();
        for (K key: result.keySet())  {
            realResult.put(key, unsortedMap.get(key));
        }

        return realResult;
    }

    /*public static <K, V extends Comparable<V>> LinkedHashMap<K, Map<K, V>>
         sortHashMapArray(Map<K, Map<K, V>> unsortedMap) {

        //why erasure?
    }*/

    public static <K, V> LinkedHashMap<K, ArrayList<V>>
                              sortHashMapArray(Map<K, ArrayList<V>> unsortedMap)  {
      //  LinkedHashMap<K, Z<V>> result = newlisting LinkedHashMap<>();

        LinkedHashMap<K, ArrayList<V>> result = new LinkedHashMap<>();

        ArrayList<K> sortedKeys = new ArrayList<>();
        for (K key: unsortedMap.keySet())  {
            sortedKeys.add(key);
        }

        //Long minSoFar = unsortedMap.get(unsortedMap.keySet().iterator().next());
        for (int i=0; i<unsortedMap.size(); i++)  {
            for (int j=1; j<sortedKeys.size(); j++)  {
                if (unsortedMap.get(sortedKeys.get(j)).size() > unsortedMap.get(sortedKeys.get(j-1)).size()) {
                    K temp = sortedKeys.get(j);
                    sortedKeys.set(j, sortedKeys.get(j-1));
                    sortedKeys.set(j-1, temp);

                }
            }
        }

        //System.out.println("sortedKeys: " + sortedKeys);
        for (K key: sortedKeys)  {
            result.put(key, unsortedMap.get(key));
        }

        return result;
    }

}
