require python-catkin-pkg.inc

inherit setuptools3

PROVIDES += "python3-catkin-pkg-modules"
PROVIDES_append_class-native = " python3-catkin-pkg-modules-native"

RPROVIDES_${PN} += "python3-catkin-pkg-modules"
RPROVIDES_${PN}_append_class-native = " python3-catkin-pkg-modules-native"
