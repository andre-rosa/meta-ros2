# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_gazebo_thermal_camera provides a gazebo plugin that produces simulated thermal camera images. The plugin uses modified code from the gazebo_ros_camera plugin."
AUTHOR = "Johannes Meyer <johannes@intermodalics.eu>"
HOMEPAGE = "http://ros.org/wiki/hector_gazebo_thermal_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    gazebo-plugins \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo \
    gazebo-plugins \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo \
    gazebo-plugins \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_gazebo_thermal_camera/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8454a7bddc3c17e7b2501afbc16ee1cb"
SRC_URI[sha256sum] = "6a3221be450c74fed270dcff5e3399e8e5650169b2bdf36ecf588a9602d95a2c"
S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_gazebo_thermal_camera-0.5.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/hector-gazebo/hector-gazebo_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/hector-gazebo/hector-gazebo_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/hector-gazebo/hector-gazebo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/hector-gazebo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/hector-gazebo/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
