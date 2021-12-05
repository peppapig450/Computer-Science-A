#!/usr/bin/env bash 

checkCommands() {
  if ! command -v javac &> /dev/null 
  then 
    echo "Java compiler not found, exiting.."
    return 127 
  fi 

  if ! command -v java &> /dev/null 
  then 
    echo "Java not found, exiting.."
    return 127 
  fi 
  if [[ $(uname) = 'Darwin' ]]; then 
    find='gfind'
  else 
    find='find'
  fi
}

run() {
  if [ -z $($find . -maxdepth 1 -type f -name '*.class' -printf 1 -quit) ]; then 
    java Main 
  else 
    javac "${files[@]}" && java Main
  fi
}
files=()
checkCommands 
if [ $? -eq 0 ]; then 
  while IFS= read -r -d $'\0' f; do
    f="${f:2}"
    files+=("$f")
  done < <(find . -type f -name '*.java' -print0)
  run
  fi
exit 1
