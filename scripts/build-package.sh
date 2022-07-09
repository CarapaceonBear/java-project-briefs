#!/bin/bash
student=$1
brief=$2

if [ ! -d ./src/"$student"/"$brief" ]; then
  cleanBrief=$(echo "$brief" | tr -d '-';)
  mkdir ./src/"$student"/"$cleanBrief"
  touch ./src/"$student"/"$cleanBrief"/Main.java
  {
    echo "package $student.$cleanBrief;"
    echo ""
    echo "public class Main {"
    echo "    public static void main(String[] args) {"
    echo "        System.out.println(\"Let's solve $brief\");}"
    echo "}"
  } >>./src/"$student"/"$cleanBrief"/Main.java
fi
