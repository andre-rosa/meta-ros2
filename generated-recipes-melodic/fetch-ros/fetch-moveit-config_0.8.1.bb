# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the fetch_urdf with the MoveIt Motion Planning Framework"
AUTHOR = "Russell Toris <rtoris@fetchrobotics.com>"
ROS_AUTHOR = "MoveIt Setup Assistant <assistant@moveit.ros.org>"
HOMEPAGE = "http://moveit.ros.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_moveit_config"

ROS_BUILD_DEPENDS = " \
    fetch-description \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    fetch-description \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fetch-description \
    fetch-ikfast-plugin \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-python \
    moveit-ros-move-group \
    moveit-ros-visualization \
    moveit-simple-controller-manager \
    robot-state-publisher \
    rospy \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_moveit_config/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "39ec912f9f6bcd572236b3c340afff6a"
SRC_URI[sha256sum] = "cd8f245340ae00e0138b66eebbe75fb95da8a60bfbe05b329d20160f098a858f"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_moveit_config-0.8.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fetch-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fetch-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/fetch-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/fetch-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
