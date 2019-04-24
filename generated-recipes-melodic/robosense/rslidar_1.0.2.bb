# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Basic ROS support for the Robosense 3D LIDARs."
AUTHOR = "Abraham Monrroy <abrahammonrroy@yahoo.com>"
ROS_AUTHOR = "Tony Zhang <tony.zhang@robosense.cn>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "robosense"
ROS_BPN = "rslidar"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rslidar-driver \
    rslidar-msgs \
    rslidar-pointcloud \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rslidar-driver \
    rslidar-msgs \
    rslidar-pointcloud \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "850df75c9abd3f9e4f2f31d317f38fff"
SRC_URI[sha256sum] = "afc1683d73695c2460bccb0db0b1ecf4907ddff91506e6c4c33ac34ecf91a5f6"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar-1.0.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('robosense', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('robosense', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robosense/robosense_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robosense/robosense-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robosense/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robosense/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
