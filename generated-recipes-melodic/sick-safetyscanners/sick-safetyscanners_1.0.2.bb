# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Provides an Interface to read the sensor output of a SICK   Safety Scanner"
AUTHOR = "Lennart Puck <puck@fzi.de>"
ROS_AUTHOR = "Lennart Puck"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "ALv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=48a602c865794401f5c0c56e309d9596"

ROS_CN = "sick_safetyscanners"
ROS_BPN = "sick_safetyscanners"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    message-generation \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    message-runtime \
    roscpp \
    rqt-reconfigure \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SICKAG/sick_safetyscanners-release/archive/release/melodic/sick_safetyscanners/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "03c92a0b2c271ab0ae5edd55e703c2bd"
SRC_URI[sha256sum] = "1704147cac2d6645162141e5474d67d5a3e63e1a52b2ac98e321b922fc5f3bbd"
S = "${WORKDIR}/sick_safetyscanners-release-release-melodic-sick_safetyscanners-1.0.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('sick-safetyscanners', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('sick-safetyscanners', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-safetyscanners/sick-safetyscanners_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-safetyscanners/sick-safetyscanners-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-safetyscanners/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sick-safetyscanners/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
