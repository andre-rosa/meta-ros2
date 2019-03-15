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
