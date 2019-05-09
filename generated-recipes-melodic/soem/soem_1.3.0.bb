# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "SOEM is an open source EtherCAT master library written in c. Its      primary target is Linux but can be adapted to other OS and      embedded systems. (http://developer.berlios.de/projects/soem/)       This package contains the original soem c code provided by the Technische Universiteit Eindhoven."
AUTHOR = "Ruben Smits <ruben@intermodalics.eu>"
ROS_AUTHOR = "Arthur Ketels and M.J.G. van den Molengraft"
HOMEPAGE = "http://developer.berlios.de/projects/soem"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d2094aa59491bce7d3aaf0a0450d7783"

ROS_CN = "soem"
ROS_BPN = "soem"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mgruhler/soem-gbp/archive/release/melodic/soem/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d38465ef865e744817b907b075eb7961"
SRC_URI[sha256sum] = "79cdd2124448cb591bcccded0b04a2bc74e0a44c030c84187b1e9aaa6a1ea7cb"
S = "${WORKDIR}/soem-gbp-release-melodic-soem-1.3.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('soem', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('soem', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/soem/soem_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/soem/soem-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/soem/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/soem/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
