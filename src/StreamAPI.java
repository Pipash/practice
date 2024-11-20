package src;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println(result);

        //Transform a list of strings into a list of their uppercase versions
        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<String> wordResult = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(wordResult);

        //Given a list of lists of strings, flatten them into a single list of strings.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("three", "four")
        );
        List<String> listResult = listOfLists.stream()
                .flatMap(str -> str.stream())
                .collect(Collectors.toList());
        System.out.println(listResult);

        //Remove duplicates from a list of integers.
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 3, 4, 4, 7, 7, 9);
        List<Integer> distinctNumber = duplicateNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumber);

        //Sort a list of names in reverse alphabetical order.
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        List<String> sortedNames = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNames);

        //Put each element in a list while converting them to uppercase.
        List<String> originalWords = new ArrayList<>();
        List<String> wordList = Arrays.asList("apple", "banana", "orange");
        List<String> updatedWords = wordList.stream()
                .peek(word -> originalWords.add(word))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("originalWords: "+ originalWords);
        System.out.println("updatedWords: "+ updatedWords);

        //Fetch the first 3 elements from a list of integers
        List<Integer> limitTestList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> limitedList = limitTestList.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(limitedList);

        //Skip the first 4 elements and fetch the remaining elements from a list of integers.
        List<Integer> skipTestList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> skipedList = skipTestList.stream()
                .skip(4)
                .collect(Collectors.toList());
        System.out.println(skipedList);

        //Terminal Operations
        //Print each element of a list of strings with a prefix "Item: ".
        List<Integer> foreachTestList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        foreachTestList.stream().forEach(number -> System.out.println("The number is: "+ number));

        //Collect a list of integers into a `Set`.
        List<Integer> setTestList = Arrays.asList(1, 2, 3, 3, 4, 4, 7, 7, 9);
        Set<Integer> setResult = setTestList.stream()
                .collect(Collectors.toSet());
        System.out.println(setResult);

        //Compute the product of all numbers in a list. Reduce always return single value.
        List<Integer> reduceTestList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> reduceResult = reduceTestList.stream()
                .reduce((a, b) -> a * b);
        System.out.println(reduceResult);

        //The `allMatch` method in Java Streams is used to check if all elements in the stream satisfy a given predicate.
        //It returns `true` if every element in the stream matches the predicate, and `false` otherwise.
        //The `allMatch` is a short-circuiting operation, which means if any of the items of list fails to
        //satisfy the condition then immediately the operation stops and return false.
        //Check if all numbers in a list are positive.
        List<Integer> allMatchTestList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        boolean allMatchResult = allMatchTestList.stream().allMatch(n -> n > 0);
        System.out.println(allMatchResult);

        //The `anyMatch` method checks whether *at least one element* in the stream matches a given predicate.
        //It returns `true` as soon as it finds an element that satisfies the predicate and stops further processing.
        //If no elements match, it returns `false`.
        //`anyMatch` is short-circuiting, meaning it stops processing as soon as it finds the first element
        //that matches the predicate, optimizing performance.

        List<Integer> anyMatchTestList = Arrays.asList(5, 8, 12, 3);
        boolean anyMatchResult = anyMatchTestList.stream().anyMatch(n -> n > 10);
        System.out.println(anyMatchResult);

        //The `noneMatch` method in Java Streams is used to check if *no elements* in the stream match a given predicate.
        //It returns `true` if none of the elements satisfy the predicate and `false` if at least one element does.
        //Like `allMatch` and `anyMatch`, `noneMatch` is short-circuiting.
        //It stops processing as soon as it finds the first element that matches the predicate and immediately returns `false`
        //Check if no elements in a list are negative.
        List<Integer> noneMatchTestList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        boolean noneMatchResult = noneMatchTestList.stream().noneMatch(n -> n < 0);
        System.out.println(noneMatchResult);

        //is used to retrieve the *first element* in a stream that matches a given condition or simply the first element
        //in the stream if no filtering is applied. It returns the first element wrapped in an `Optional`,
        //which is a container object that may or may not contain a non-null value.
        //findFirst is a short-circuiting operation, meaning it stops processing as soon as it finds the first element.
        //Find the first element in a list that starts with the letter 'b'
        List<String> findFirstTestList = Arrays.asList("apple", "banana", "cherry", "blackberry");
        Optional<String> findFirstResult = findFirstTestList.stream()
                .filter(word -> word.startsWith("b"))
                .findFirst();
        System.out.println(findFirstResult.get());

        //findAny: retrieve any element from the stream that matches a given condition
        //findAny is a short-circuiting operation, meaning it stops processing as soon as it finds any element that satisfies the condition
        //FInd any element in a list that starts with the letter 'c'
        List<String> findAnyTestList = Arrays.asList("apple", "banana", "cherry", "blackberry", "cantaloupe");
        Optional<String> findAnyResult = findAnyTestList.stream()
                .filter(word -> word.startsWith("c"))
                .findAny();
        System.out.println(findAnyResult);

        //Find the maximum and minimum value from a list of integer
        List<Integer> maxTestList = Arrays.asList(5, 1, 8, 3, 9);
        Optional<Integer> max = maxTestList.stream().max(Integer::compareTo);
        System.out.println(max);

        Optional<Integer> min = maxTestList.stream().min(Integer::compareTo);
        System.out.println(min);

        //Convert a list of String into an array
        List<String> toArrayTestList = Arrays.asList("apple", "banana", "cherry", "blackberry", "cantaloupe");
        String[] toArrayResult = toArrayTestList.stream().toArray(str -> new String[str]);
        System.out.println(Arrays.toString(toArrayResult));

        //Collect
        //joining is used to concatenate the element of a stream into a single String
        //joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
        List<String> joiningTestList = Arrays.asList("apple", "banana", "cherry", "blackberry", "cantaloupe");
        String joiningResult = joiningTestList.stream().collect(Collectors.joining(", "));
        System.out.println(joiningResult);

        joiningResult = joiningTestList.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joiningResult);

        //Group elements of the stream by a specified classifier function.
        //Group a list of people by their city
        List<Person> people = Arrays.asList(
                new Person("John", "New York"),
                new Person("Jane", "London"),
                new Person("Jack", "New York")
        );

        Map<String, List<Person>> groupingByResult = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        System.out.println(groupingByResult);

        //partitioningBy: Collectors partitioningBy() method is used to partition a stream of objects based on a given predicate
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer> > map = s.collect(Collectors.partitioningBy(num -> num > 3));
        System.out.println(map);

        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, Long> map2 = s2.collect(Collectors.partitioningBy(num -> num > 3, Collectors.counting()));
        System.out.println(map2);

        List<Integer> integerList = Arrays.asList(23, 23, 8);
        IntSummaryStatistics intSummaryStatistics = integerList.stream().collect(Collectors.summarizingInt(e -> e));
        System.out.println(intSummaryStatistics);

    }
}

class Person{
    String name;
    String city;

    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return this.name+" "+this.city;
    }
}
