.SUFFIXES: .class .java
.PHONY: clean

JAVAC=javac
TARGET=Hanoi.class

all: ${TARGET}

.java.class:
	$(JAVAC) $<

lint:
	$(JAVAC) -Xlint:unchecked ${NAME}.java

clean:
	-rm -f *.class
