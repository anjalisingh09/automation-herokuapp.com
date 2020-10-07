x=($(git log --pretty="%ce"| sort| uniq))
for i in "${x[@]}"
do
    echo $i
    git log --shortstat --author=$i  --pretty=tformat: --numstat \
      | grep "files\? changed" \
      | awk '{files+=$1; inserted+=$4; deleted+=$6} END \
             {print "files changed: ", files, "\tlines inserted: ", inserted, "\tlines deleted:", deleted}'

    echo "\n"
done