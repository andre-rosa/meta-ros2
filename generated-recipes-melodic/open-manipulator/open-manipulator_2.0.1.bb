# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-enabled OpenManipulator is a full open robot platform consisting of OpenSoftware​, OpenHardware and OpenCR(Embedded board)​.     The OpenManipulator is allowed users to control it more easily by linking with the MoveIt! package. Moreover it has full hardware compatibility with TurtleBot3​.      Even if you do not have a real robot, you can control the robot in the Gazebo simulator​."
AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "open_manipulator"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    open-manipulator-control-gui \
    open-manipulator-controller \
    open-manipulator-description \
    open-manipulator-libs \
    open-manipulator-moveit \
    open-manipulator-teleop \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "740bdd3d4d4647af929a793f4b43bb3c"
SRC_URI[sha256sum] = "8de684b52de5da0e425146ae3a13c0ab79f047544aa163c5b3344b8df2284ea3"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator-2.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/open-manipulator/open-manipulator_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/open-manipulator/open-manipulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/open-manipulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
