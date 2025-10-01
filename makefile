all: compile

compile: Main.java pokemons/Luvdisc.java
	javac -cp libs/* -d target -sourcepath . Main.java pokemons/*.java

run:
	java -cp libs/*;target Main