# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Quickly load variables from rosparam with good command line error checking."
AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
HOMEPAGE = "https://github.com/davetcoleman/rosparam_shortcuts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rosparam_shortcuts"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    eigen-conversions \
    libeigen \
    roscpp \
    roslint \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PickNikRobotics/rosparam_shortcuts-release/archive/release/melodic/rosparam_shortcuts/0.3.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ae291798743da99e16e11b7f1de67642"
SRC_URI[sha256sum] = "98ae1e0dfc847978257e1ec58b7c183ac4304dc620ac460356d33473adba7042"
S = "${WORKDIR}/rosparam_shortcuts-release-release-melodic-rosparam_shortcuts-0.3.1-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosparam-shortcuts/rosparam-shortcuts_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosparam-shortcuts/rosparam-shortcuts_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosparam-shortcuts/rosparam-shortcuts-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosparam-shortcuts/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosparam-shortcuts/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
