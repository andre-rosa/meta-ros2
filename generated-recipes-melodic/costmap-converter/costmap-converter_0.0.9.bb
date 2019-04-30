# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cells to primitive types."
AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
HOMEPAGE = "http://wiki.ros.org/costmap_converter"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    pluginlib \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    pluginlib \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    pluginlib \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/rst-tu-dortmund/costmap_converter-release/archive/release/melodic/costmap_converter/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bcdf6d4dc779eb94e7660ffcaae9e800"
SRC_URI[sha256sum] = "350d4ffc88daa687ea48b4fb8b04889a95b9213f2f5ef676e49ceba9120fc8c7"
S = "${WORKDIR}/costmap_converter-release-release-melodic-costmap_converter-0.0.9-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/costmap-converter/costmap-converter_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/costmap-converter/costmap-converter_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/costmap-converter/costmap-converter-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/costmap-converter/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/costmap-converter/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
