(i) Say s is a parameter of type String, write appropriate type for variable c1
Consumer<String> c1 = s -> System.out.println(s);

(ii) Say s & i are parameters of type String & Integer, write appropriate type for variable c2
BiConsumer<String, Integer> c2 = (s, i) -> System.out.println(s.length() - i);

(iii) write appropriate type for variable c3
Supplier<String> c3 = () -> "Hello";

(iv) Say l is a parameter of type List<String>, write appropriate type for variable c4
Consumer<List<String>> c4 = l -> l.add("Aman");

(v) Say s is a parameter of type String, write appropriate type for variable c5
Function<String, Character>c5 = s -> return s.charAt(0);

(vi) Write appropriate type for variable c5
Function<String, Double> c6 = Double::parseDouble;

(vii) Look at the following code-
Exception ex = new ArrayIndexOutOfBoundsException("Not a Valid index");
Function<Exception, String> c7 = ex::toString; ---- (a)
System.out.println(c7._______________); ---- (b)
(a) Write appropriate type for variable c7
(b) Write appropriate method call here

(viii) Look at the following code-
(Tip: The printStackTrace method of Exception class takes object of PrintStream as parameter and it return nothing)
Exception ex = new ArrayIndexOutOfBoundsException(2);
Consumer<PrintStream> c8 = ex::printStackTrace; ----(a)
c8.accept(System.out); -----(b)
(a) Write appropriate type for variable c8
(b) Write appropriate method call here such the the output of printStackTrace must be on console.

(ix) Look at the following code
Set<Integer> set= new LinkedHashSet<>();
Consumer<Integer> c9 = set::add;----(a)
c9.accept(10);----(b)
(a) Write appropriate type for variable c9
(b) Write appropriate method call here such the value 10 should be added to the set.

(x) Look at the following code
List<String> list = new ArrayList<>();
list.add("One");
BiConsumer<Integer, String> c10 = list::add; ----(a)
c10.accept(0, "Zero"); ----(b)
(a) Write appropriate type for variable c10
(b) Write appropriate method call here such the value "Zero" should be added at the index 0.

(xi)
Tip: The V putIfAbsent(K key, V value) method of Map interface works as follow-
If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.

Map<Integer, String> map = new LinkedHashMap<>();
BiFunction<Integer, String, String> c11 = map::putIfAbsent; ----(a)
c11.apply(0, "Zero"); ----(b)
(a) Write appropriate type for variable c11
(b) Write appropriate method call here such the value "Zero" should be added at key 0.

(xii)
Function<String, StringBuilder> bif = str -> new StringBuilder(str); ----(a)
StringBuilder s1 = bif.apply("all is well");----(b)
(a) Write appropriate syntax here such that new object of StringBuilder should be created using String parameter
(b) Write appropriate method call here such the value of parameter is "all is well"
