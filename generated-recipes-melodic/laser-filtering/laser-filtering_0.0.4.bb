# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ROS Libraries for filtering specific kinds of laser scans"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_filtering"
ROS_BPN = "laser_filtering"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    map-laser \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    map-laser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/wu-robotics/laser_filtering_release/archive/release/melodic/laser_filtering/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "902da717920705306773602caa625ce8"
SRC_URI[sha256sum] = "d5aed79a7f8e17e1ffc7f9e88fa741a3d7d3a6134b822428cb8e0eab2326be62"
S = "${WORKDIR}/laser_filtering_release-release-melodic-laser_filtering-0.0.4-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('laser-filtering', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('laser-filtering', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-filtering/laser-filtering_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-filtering/laser-filtering-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-filtering/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-filtering/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
