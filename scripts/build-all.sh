#!/bin/bash

students=('aiman' 'awo' 'fernanda' 'gavin' 'hassan' 'hugo' 'isobelle' 'mark' 'younus' 'rachel' 'samuel' 'wesley' 'will' 'rob' 'charlie')
briefs=('simple-arithmetic' 'rock-paper-scissors' 'quiz-game' 'text-adventure' 'employee-registry' 'selective-breeding')

for student in "${students[@]}"; do
  if [ ! -d ./src/"$student" ]; then
    mkdir ./src/"$student"
  fi
  for brief in "${briefs[@]}"; do
    ./scripts/build-package.sh "$student" "$brief"
  done
  echo "Projects updated : $student"
done
