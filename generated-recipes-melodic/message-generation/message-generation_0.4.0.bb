# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Package modeling the build-time dependencies for generating language bindings of messages."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/message_generation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "message_generation"
ROS_BPN = "message_generation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gencpp \
    geneus \
    genlisp \
    genmsg \
    gennodejs \
    genpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gencpp \
    geneus \
    genlisp \
    genmsg \
    gennodejs \
    genpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/message_generation-release/archive/release/melodic/message_generation/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dbf72e609e6abb8e8a607fdd3b0e7344"
SRC_URI[sha256sum] = "e868cdae2dcb54701e86484cb186fad8814bbd295db8a0224c4c14c3651d9303"
S = "${WORKDIR}/message_generation-release-release-melodic-message_generation-0.4.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('message-generation', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('message-generation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/message-generation/message-generation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/message-generation/message-generation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/message-generation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/message-generation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}