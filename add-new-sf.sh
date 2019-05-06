[ $# -ne 2 ] && { echo "Usage: sh $0 EXTRACTED-DIR ROS-DISTRO"; exit 1; }

set -e

tmpdir=$1
distro=$2
case $distro in
    "melodic"|"bouncy"|"crystal"|"dashing")
        ;;

    *)  echo "ABORT: Unrecognized ROS-DISTRO: $distro"
        exit 1
        ;;
esac
gendir="generated-recipes-$distro"

set -x
[ -d $gendir ] && git rm -r $gendir
cp -r $tmpdir/$gendir/ .
find $gendir -type f | xargs chmod 644
find $gendir -type d | xargs chmod 755
git add $gendir

mkdir -p conf/ros-distro/include/$distro
cp $tmpdir/conf/ros-distro/include/$distro/generated-ros-distro.inc conf/ros-distro/include/$distro/.
chmod 644 conf/ros-distro/include/$distro/generated-ros-distro.inc

mkdir -p files/$distro
if [ -d  $tmpdir/files/$distro ]; then
    cp $tmpdir/files/$distro/* files/$distro/.
else
    cp $tmpdir/files/$distro-cache.yaml files/$distro/cache.yaml
    cp $tmpdir/files/rosdep-resolve.yaml files/$distro/.
    cp $tmpdir/files/superflore-change-summary.txt files/$distro/.
fi
chmod 644 files/$distro/*

git status
