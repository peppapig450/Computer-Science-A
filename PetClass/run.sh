#!/usr/bin/env bash

checkCommands() {
	if ! command -v javac &>/dev/null; then
		echo "Java compiler not found, exiting.."
		return 127
	fi

	if ! command -v java &>/dev/null; then
		echo "Java not found, exiting.."
		return 127
	fi
}

run() {
        if ls $(pwd)/*.class > /dev/null 2>&1 ; then
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
else
	exit 1
fi
