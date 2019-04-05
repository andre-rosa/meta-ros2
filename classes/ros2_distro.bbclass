inherit ros_distro

# Place metadata unique to ROS 2 distros here.

# ROS1_COMPONENTS is set in conf/ros-distro/ros-distro.conf .
def ros_distro__get_component_type(component, d):
    return bb.utils.contains('ROS1_COMPONENTS', component, 'ros1', 'ros2', d)

# XXX These might be needed for ROS 1. NB. catkin.bbclass inherits faulty-solibs.
inherit faulty-solibs
FILES_${PN}_prepend = " \
    ${datadir}/${ROS_BPN} \
    ${datadir}/ament_index \
    ${libdir}/${PYTHON_DIR} \
    ${libdir}/${ROS_BPN} \
"

FILES_${PN}-dev_prepend = " \
    ${datadir}/${ROS_BPN}/cmake \
"

# XXX This is workaround to get rid of finding two-depth-dependent libraries from dependent package's recipe-sysroot. We assume
# this is only an issue with ROS 2.
do_install_append() {
    # Do not export absolute path of recipe-sysroot folder in the .cmake files.
    find ${D} -name "*.cmake" -exec sed -i 's:${RECIPE_SYSROOT}${includedir}:$ENV{STAGING_INCDIR}:g' {} \;
    find ${D} -name "*.cmake" -exec sed -i 's:${RECIPE_SYSROOT}${libdir}:$ENV{STAGING_LIBDIR}:g' {} \;
}
