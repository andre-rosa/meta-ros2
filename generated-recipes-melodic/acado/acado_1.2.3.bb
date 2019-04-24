# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ACADO Toolkit"
AUTHOR = "Ronald Ensing <r.m.ensing@tudelft.nl>"
ROS_AUTHOR = "Milan Vukov"
HOMEPAGE = "http://acado.github.io/"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3460237096e94473a838c16f7071063e"

ROS_CN = "acado"
ROS_BPN = "acado"

ROS_BUILD_DEPENDS = " \
    boost \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    catkin \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    catkin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tud-cor/acado-release/archive/release/melodic/acado/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bdce9ba4f9a7ca68b91c65be9cdfc6a5"
SRC_URI[sha256sum] = "2d84945378a8f8b6c9d8667b4e1aa02a0001130853e6bb04e29dc1906582598e"
S = "${WORKDIR}/acado-release-release-melodic-acado-1.2.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('acado', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('acado', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/acado/acado_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/acado/acado-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/acado/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/acado/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
