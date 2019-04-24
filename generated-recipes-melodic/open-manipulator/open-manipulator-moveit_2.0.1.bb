# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the open_manipulator with the MoveIt! Motion Planning Framework"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator_moveit"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "open_manipulator"
ROS_BPN = "open_manipulator_moveit"

ROS_BUILD_DEPENDS = " \
    open-manipulator-description \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-ros-move-group \
    moveit-ros-visualization \
    moveit-setup-assistant \
    open-manipulator-description \
    robot-state-publisher \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_moveit/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1801b7a854cff744af3c946d559d881b"
SRC_URI[sha256sum] = "3c42db504d582107d35edba1019fc8764f4082573f47bfb41e53e89230d21488"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_moveit-2.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('open-manipulator', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('open-manipulator', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator/open-manipulator_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator/open-manipulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
